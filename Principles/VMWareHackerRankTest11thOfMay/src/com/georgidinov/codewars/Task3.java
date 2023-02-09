package com.georgidinov.codewars;

import java.util.Arrays;
import java.util.Comparator;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
//    Your task is to sort a given string. Each word in the string will contain a single number.
//    This number is the position the word should have in the result.
//    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//    If the input string is empty, return an empty string.
//    The words in the input String will only contain valid consecutive numbers.

    public static String order(String words) {
        String[] toSort = words.split(" ");
        Arrays.sort(toSort, Comparator.comparing(Task3::getDigit));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < toSort.length; i++) {
            sb.append(toSort[i]);
            String space = i == toSort.length - 1 ? "" : " ";
            sb.append(space);
        }
        return sb.toString();
    }

    private static int getDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return c;
            }
        }
        return -1;
    }


}
