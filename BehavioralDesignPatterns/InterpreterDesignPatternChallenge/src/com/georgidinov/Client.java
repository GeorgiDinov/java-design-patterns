package com.georgidinov;

public class Client {


    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t\t<<<AND Expression>>>\n");
        Expression jason = new TerminalExpression("Jason");
        Expression married = new TerminalExpression("Married");
        Expression john = new TerminalExpression("John");
        InterpreterContext jasonMarried = new InterpreterContext("MarriedJason");

        ANDNonTerminalExpression and = new ANDNonTerminalExpression(jason, married);
        System.out.print("Is Jason Married Context Check: ");
        System.out.println(and.interpret(jasonMarried));
        and = new ANDNonTerminalExpression(john, married);
        System.out.print("Is John Married Context Check: ");
        System.out.println(and.interpret(jasonMarried));

        System.out.println("\n\t\t\t\t\t<<<OR Expression>>>\n");

        Expression lucy = new TerminalExpression("Lucy");
        Expression myra = new TerminalExpression("Myra");
        InterpreterContext lucyFemale = new InterpreterContext("Lucy");
        InterpreterContext myraFemale = new InterpreterContext("Myra");

        InterpreterContext jasonFemale = new InterpreterContext("Jason");


        ORNonTerminalExpression or = new ORNonTerminalExpression(lucy, myra);
        System.out.print("Is Lucy Female: ");
        System.out.println(or.interpret(lucyFemale));
        System.out.print("Is Myra Female: ");
        System.out.println(or.interpret(myraFemale));

        System.out.print("Is Jason Female: ");
        System.out.println(or.interpret(jasonFemale));

    }//end of main method

}//end of class Client
