package com.georgidinov;

public class PaySafeHackerRank {

    public static void main(String[] args) {

    }//end of main method

    //one of the coding tasks
    static String maxSubstring(String s) {
        String result = "";
        if (s != null) {
            if ((s.length() >= 1) && (s.length() <= 100) && (s.matches("^[a-z]+"))) {
                for (int i = 0; i < s.length(); i++) {
                    if (result.compareTo(s.substring(i)) <= 0) {
                        result = s.substring(i);
                    }
                }
            }else{
                return null;
            }
        }
        return result;
    }


//another one of the coding tasks
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


}//end of class Main
