package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("test.txt");

        System.out.println("Adding state...");
        originator.write("System STATE # 1\n");
        System.out.println(originator);
        System.out.println("Saving state 1...\n");
        caretaker.save(originator);

        System.out.println("Adding more state...");
        originator.write("System STATE # 2\n");
        System.out.println(originator);
        System.out.println("Saving state 2...\n");
        caretaker.save(originator);

        System.out.println("\nRestoring to STATE # 1: ");
        caretaker.restore(originator,0);
        System.out.println(originator);

        System.out.println("\nRestoring to STATE # 2: ");
        caretaker.restore(originator,1);
        System.out.println(originator);

        System.out.println("\nRestoring to STATE # 1: ");
        caretaker.restore(originator,0);
        System.out.println(originator);

        System.out.println("Adding more state...");
        originator.write("System STATE # 3\n");
        System.out.println(originator);
    }//end of main method

}//end of class Client
