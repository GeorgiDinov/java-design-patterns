package com.georgidinov.somestuff;

//Alien Message
//        Your task is to translate a message in some alien language (let's call it Alienski).
//        The message could be created by following simple rules and from two known languages,
//        English and Spanish.
//        Each word in Alienski is constructed by subtracting the letters from English and Spanish
//        (absolute value) and that is the resulting letter.
//        There are two special cases.
//        If in each of the words the symbol is '-' (hyphen) or ' ' (space)
//        it is mandatory for it to be kept this way.
//        There won't be a case with a '-' (hyphen) and a ' ' (space) at the same time.
//        If one of the words is with more letters than the other just
//        add the letters from the longer word to the result.
//        Example:
//        talk
//        hablar
//        a b c d....
//        0 1 2 3....
//        t - h = | 19 - 7 | = 12 = m
//        a - a = | 0 - 0 | = 0 = a
//        l - b = | 11 - 1 | = 10 = k
//        k - l = | 10 - 11 | = 1 = b
//        empty - a = a
//        empty - r = r
//        Result:
//        makbar
//        Input:
//        Read from the standard input:
//        Two lines with messages in English and Spanish
//        Each message is on new line.

//        Output:
//        Print on the standard output:
//        On the single line of the output, print the decoded message in Alienski

//        Constraints:
//        All the letters will be small letters from the Latin alphabet and the special symbols '-' (hyphen) and ' ' (space).
//        Hint
//        Use the ASCII table
//        'a' - 'a' = 0
//        Sample tests:
//        Input
//        thank you
//        muchas gracias
//        Output
//        hncgk  idacias
//        Note: There are two spaces here
//        Input:
//        test
//        el examen
//        Output
//        ph pxamen

public class AlienMessage {


    public static void main(String[] args) {
        String english = "thank you";
        String spanish = "muchas gracias";
        translateToAliensLanguage(english, spanish);
    }//end of main method

    public static void translateToAliensLanguage(String english, String spanish) {
        StringBuilder alienWord = new StringBuilder();
        char[] englishWord = english.toCharArray();
        char[] spanishWord = spanish.toCharArray();
        int i;
        for (i = 0; i < englishWord.length; i++) {
            char englishChar = englishWord[i];
            char spanishChar = spanishWord[i];
            if (Character.isWhitespace(englishChar)) {
                alienWord.append(englishChar);
                continue;
            }
            if (Character.isWhitespace(spanishChar)) {
                alienWord.append(spanishChar);
                continue;
            }
            char newChar = (char) (Math.abs(englishChar - spanishChar) + 'a');
            alienWord.append(newChar);
        }//end of while loop

        alienWord.append(spanish.substring(i));
        System.out.println("Result: " + alienWord.toString());

    }//end of method translateToAliensLanguage

}//end of class AlienMessage
