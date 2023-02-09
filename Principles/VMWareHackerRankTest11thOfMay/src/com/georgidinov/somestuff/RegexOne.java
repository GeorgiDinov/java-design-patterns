package com.georgidinov.somestuff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOne {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphaNumeric.replaceAll(".", "Y"));

        System.out.println(alphaNumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^abcDeee"));
        System.out.println(alphaNumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphaNumeric.replaceAll("jkl99z$", "The End"));
        System.out.println(alphaNumeric.replaceAll("[aei]", "X"));
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
        String newAlphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphaNumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\D", "X"));
        String hasWhiteSpace = "I have blanks and \t a tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));

        System.out.println(newAlphaNumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

        String thirdAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("h+i*j", "Y"));
        System.out.println(thirdAlphanumeric.replaceAll("[Hh]+i*j", "Y"));


        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-Heading</h2>");
        htmlText.append("<p>This is a paragraph about something</p>");
        htmlText.append("<p>This is another paragraph about something else</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);//, Pattern.CASE_INSENSITIVE,Pattern.UNICODE_CASE
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + ": " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();
        while (groupMatcher.find()) {
            System.out.println("Occurrence " + groupMatcher.group(1));
        }


        System.out.println("*************************");
        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);
        System.out.println(h2TextMatcher.matches());
        h2TextMatcher.reset();

        while (h2TextMatcher.find()) {
//            System.out.println("Occurrence group 0 : " + h2TextMatcher.group(0));
//            System.out.println("Occurrence group 1 : " + h2TextMatcher.group(1));
            System.out.println("Occurrence group 2 : " + h2TextMatcher.group(2));
//            System.out.println("Occurrence group 3 : " + h2TextMatcher.group(3));
        }


        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));
        String tvTest = "tstvtkt";
//        String tNotvRegEx = "t[^v]";
        String tNotvRegEx = "t(?!v)";//t(?=v)
        Pattern tnot = Pattern.compile(tNotvRegEx);
        Matcher tnOtMatcher = tnot.matcher(tvTest);
        count = 0;
        while (tnOtMatcher.find()) {
            System.out.println("occurrence : " + count + " : " + tnOtMatcher.start() + " to " + tnOtMatcher.end());
        }

        String usPhoneRegEx = "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
        String phone1 = "1234567890";
        String phone2 = "(123) 245-2345";//should match
        String phone3 = "123 456-7890";
        String phone4 = "(123)456-6789";

        System.out.println("phone1 = " + phone1.matches(usPhoneRegEx));
        System.out.println("phone2 = " + phone2.matches(usPhoneRegEx));
        System.out.println("phone3 = " + phone3.matches(usPhoneRegEx));
        System.out.println("phone4 = " + phone4.matches(usPhoneRegEx));

        String visaCardRegEx = "^4[0-9]{12}([0-9]{3})?$";
        String visa1 = "4444444444444";
        String visa2 = "5444444444444";
        String visa3 = "4444444444444444";
        String visa4 = "4444";
        System.out.println("visa1 = " + visa1.matches(visaCardRegEx));
        System.out.println("visa2 = " + visa2.matches(visaCardRegEx));
        System.out.println("visa3 = " + visa3.matches(visaCardRegEx));
        System.out.println("visa4 = " + visa4.matches(visaCardRegEx));


    }//end main method


}
