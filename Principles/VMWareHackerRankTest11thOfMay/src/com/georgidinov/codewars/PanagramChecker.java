package com.georgidinov.codewars;

import java.util.HashSet;
import java.util.Set;

public class PanagramChecker {

    public static void main(String[] args) {
        PanagramChecker panagramChecker = new PanagramChecker();
        System.out.println(panagramChecker.check2("The, ! quick brown fox jumps over the lazy dog."));
    }

    public boolean check(String sentence) {
        //String noPunctuation = sentence.replaceAll("\\p{Punct}", "");
        String lowerCased = sentence.toLowerCase();
        char[] characters = lowerCased.toCharArray();
        Set<Character> charSet = new HashSet<>();
        for (char character : characters) {
            if (character >= 'a' && character <= 'z') {
                charSet.add(character);
            }
        }
        return charSet.size() == 26;
    }//end of method check

    //
    public boolean check2(String sentence) {
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }//end of method check2

}//end of class PangramChecker
