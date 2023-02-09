package com.georgidinov.codewars;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
    //Return the number (count) of vowels in the given string.
//    We will consider a, e, i, o, and u as vowels for this Kata.
//    The input string will only consist of lower case letters and/or spaces.
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            switch (temp) {
                case 'a':
                    vowelsCount++;
                    break;
                case 'e':
                    vowelsCount++;
                    break;
                case 'i':
                    vowelsCount++;
                    break;
                case 'o':
                    vowelsCount++;
                    break;
                case 'u':
                    vowelsCount++;
                    break;
                default:
                    break;
            }
        }
        return vowelsCount;
    }
}
