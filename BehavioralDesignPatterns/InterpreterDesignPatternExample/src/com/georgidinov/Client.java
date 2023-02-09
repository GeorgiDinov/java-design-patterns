package com.georgidinov;

public class Client {

    private InterpreterContext context;

    public Client(InterpreterContext context) {
        this.context = context;
    }//end of constructor

    public String interpret(String str) {
        Expression exp = null;
        //perform the parsing
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(getNumberFromString(str));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(getNumberFromString(str));
        } else {
            return str;
        }
        return exp.interpret(context);
    }//end of method interpret

    private int getNumberFromString(String str) {
        return Integer.parseInt(str.substring(0, str.indexOf(" ")));
    }//end of method getNumberFromString

    public static void main(String[] args) {

        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());
        System.out.println(str1 + " = " + client.interpret(str1));
        System.out.println(str2 + " = " + client.interpret(str2));

    }//end of main method

}//end of class Main
