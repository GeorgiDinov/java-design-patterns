package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Composite Design Pattern>>>\n");
        //Composite Nodes
        Supervisor dean = new Supervisor("prof. d-r A.Golev", "Dean Of FMI");
        Supervisor csChairMan = new Supervisor("doc. d-r A.Stoqnova", "Chair of Computer Systems");
        Supervisor mathChairMan = new Supervisor("doc. d-r T.Glushkova", "Chair of Math");

        //Leaf Nodes
        Professor mathProfessor1 = new Professor("prof. Math 1", "Adjunct", "+359-01");
        Professor mathProfessor2 = new Professor("prof. Math 2", "Associate", "+359-02");

        //Leaf Nodes
        Professor csProfessor1 = new Professor("prof. CS 1", "Adjunct", "+359-20");
        Professor csProfessor2 = new Professor("prof. CS 2", "Professor", "+359-21");
        Professor csProfessor3 = new Professor("prof. CS 3", "Professor", "+359-22");


        //Top of hierarchy - composite
        dean.add(csChairMan);
        dean.add(mathChairMan);

        //Level in the hierarchy - composite
        csChairMan.add(csProfessor1);
        csChairMan.add(csProfessor2);
        csChairMan.add(csProfessor3);

        //Level in the hierarchy - composite
        mathChairMan.add(mathProfessor1);
        mathChairMan.add(mathProfessor2);

        System.out.println(dean.getDetails());
        for (Faculty faculty : dean.getMyFaculties()) {
            System.out.println("\t\t" + faculty.getDetails());
        }
        for (Faculty faculty : mathChairMan.getMyFaculties()) {
            System.out.println("\t\t\t\t" + faculty.getDetails());
        }
        //csChairMan.remove(csProfessor3);
        for (Faculty faculty : csChairMan.getMyFaculties()) {
            System.out.println("\t\t\t\t" + faculty.getDetails());
        }

    }//end of main method

}//end of class Client
