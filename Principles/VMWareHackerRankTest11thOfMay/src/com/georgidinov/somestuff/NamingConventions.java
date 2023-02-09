package com.georgidinov.somestuff;


//Naming Conventions
//        There are many naming conventions in different programming languages.
//        All of them are original and creative,
//        but a random mismatch of capitalization is not a valid convention yet.
//        Write a program to determine whether given word is using correct naming
//        convention and print out the one in use. Otherwise print mismatch.
//        Here are the conventions you’ll be looking for:
//        constant – all letters are capital, i.e. “USA”. Only letters are used.
//        field – all letters are lower. i.e. “bambi”. Only letters are used.
//        pascal – starts with capital letter and has only lower-case letters after that,
//        i.e. “Mind”. Only letters are used.
//        elephant – starts with some lower-case letters then continues with only capital
//        letters, i.e. “elePHANT”. Only letters are used.

//        Input
//        Read from the standard input:
//        There is one line of input, a string:
//        dollar
//        Output
//        Print to the standard output:
//        One line of output - word's naming convention -> field

//        Constraints
//        The input will be a non-empty word consisting of uppercase and lowercase Latin letters.
//        For a word to be in pascal or elephant cases, it should have at least two characters
//        Words with one characters are constant or field, depending on character's casing.

//        Sample Tests
//        Input
//        USA
//        Output
//        constant

//        Input
//        FlaG
//        Output
//        mismatch

//        Input
//        Bulgaria
//        Output
//        pascal

//        Input
//        snAKE
//        Output
//        elephant

//        Input
//        SNAke
//        Output
//        mismatch

import java.util.Scanner;

public class NamingConventions {

    private static Scanner scanner = new Scanner(System.in);

    public static final String CONSTANT = "constant";
    public static final String FIELD = "field";
    public static final String PASCAL = "pascal";
    public static final String ELEPHANT = "elephant";
    public static final String MISMATCH = "mismatch";

    private static String constantRegEx = "^[A-Z]+$";
    private static String fieldRegEx = "^[a-z]+$";
    private static String pascalRegEX = "^[A-Z][a-z]+$";
    private static String elephantRegEx = "^[a-z]+[A-Z]+$";



    public static void main(String[] args) {
        System.out.println(parser(input()));
    }//end of main method

    private static String input() {
        System.out.println("Please add a string for parsing");
        return scanner.nextLine();
    }//end of method input

    private static String parser(String input) {

        if ((input != null) && (!input.isEmpty())) {
            if (input.matches(constantRegEx)) {
                return CONSTANT;
            } else if (input.matches(fieldRegEx)) {
                return FIELD;
            } else if (input.matches(pascalRegEX)) {
                return PASCAL;
            } else if (input.matches(elephantRegEx)) {
                return ELEPHANT;
            } else {
                return MISMATCH;
            }
        } else {
            return "Invalid Value!";
        }

    }//end of method parser

}//end of class NamingConventions
