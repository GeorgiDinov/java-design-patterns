package com.georgidinov.somestuff;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string (you can include space as well)");
        s1 = in.nextLine();
        //Trim all the spaces of the string using replaceAll method
        s2 = s1.replaceAll("\\s", "");
        System.out.println(compressedString(s2));

    }//end of main method


    //Create a Java Method Compression to compress the string
    public static String compressedString(String message) {
        if (message != null) {
            int constraint = (int) Math.pow(10, 5);
            if ((message.length() <= constraint) && (message.matches("^[a-z]+"))) {
                int count = 1;
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < message.length() - 1; i++) {
                    if (message.charAt(i) == message.charAt(i - 1)) {
                        count++;
                    } else if (count == 1) {
                        sb.append(message.charAt(i - 1));
                    } else {
                        sb.append(message.charAt(i - 1));
                        sb.append(count);
                        count = 1;
                    }

                }
                if (message.length() > 1) {
                    if (message.charAt(message.length() - 1) == message.charAt(message.length() - 2)) {
                        count++;
                    } else if (count == 1) {
                        sb.append(message.charAt(message.length() - 2));
                    } else {
                        sb.append(message.charAt(message.length() - 2));
                        sb.append(count);
                        count = 1;
                    }
                    sb.append(message.charAt(message.length() - 1));
                    if (count > 1) {
                        sb.append(count);
                    }
                }
                message = sb.toString();
            } else {
                System.out.println("Invalid input");
                return null;
            }
        }
        return message;
    }
}
