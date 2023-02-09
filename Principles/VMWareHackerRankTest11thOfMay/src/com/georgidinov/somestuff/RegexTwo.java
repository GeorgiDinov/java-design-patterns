package com.georgidinov.somestuff;

public class RegexTwo {

    public static void main(String[] args) {
        String rec1 = "I want a bike.";
        String rec2 = "I want a ball.";
        //System.out.println(rec1.matches("I want a bike."));
        String[] data = {rec1, rec2};
//        for (String s : data) {
//            System.out.println(s.matches("I want a \\w+."));
//            System.out.println(s.matches("I want a (bike|ball)."));
//        }

//        String regEx = "I want a \\w+.";
//        Pattern pattern = Pattern.compile(regEx);
//        Matcher matcher = pattern.matcher(rec1);
//        System.out.println(matcher.matches());
//        matcher.reset();//it is not needed because we are using different instance after that
//        matcher = pattern.matcher(rec2);
//        System.out.println(matcher.matches());
//        matcher.reset();

//        String rec3 = "Replace all blanks with underscores.";
//        System.out.println(rec3.replaceAll("\\s", "_"));
//        System.out.println(rec3.replaceAll(" ", "_"));
//
//        String rec4 = "aaabccccccccdddefffg";
//        System.out.println(rec4.matches("aaabccccccccdddefffg"));//me
//        System.out.println(rec4.matches("[a]{3}[b][c]{8}[d]{3}[e][f]{3}[g]"));//me
//        System.out.println(rec4.matches("[abcdefg]+"));//tim
//        System.out.println(rec4.matches("[a-g]+"));//tim
//        //challenge next
//        System.out.println(rec4.matches("^[a]{3}[b][c]{8}[d]{3}[e][f]{3}[g]$"));//me
//        System.out.println(rec4.matches("^a{3}bc{8}d{3}ef{3}g$"));//tim
//        System.out.println(rec4.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "RePlaCeD"));
        //challenge next
//        String rec5 = "abcd.135";
//        String str = "kjisl.22";
//        String regEx2 = "[a-z]+\\.\\d+";
//        String regexTim = "^[A-z][a-z]+\\.\\d+$";//tim regex--> ^ and $ to ensure that we catch the pattern in that range
//        Pattern pattern2 = Pattern.compile(regEx2);
//        Matcher matcher2 = pattern2.matcher(str);
//        System.out.println(matcher2.matches());
//        matcher2.reset();

        //challenge next

//        String rec6 = "abcd.135uvqz.7tzik.999";
//        String regEx3 = "(\\d+)";// i just got the particular group while he got the whole string checked and made a group
//        String timReg = "[A-Za-z]+\\.(\\d+)";
//        Pattern pattern3 = Pattern.compile(regEx3);
//        Matcher matcher3 = pattern3.matcher(rec6);
//        System.out.println(matcher3.matches());
//        matcher3.reset();
//        int counter = 0;
//        while (matcher3.find()) {
//            counter++;
//            System.out.println("Occurrences : " + counter + " : " + matcher3.group(1));
//        }

        //challenge next
//        String rec7 = "abcd.135\tuvqz.7\ttzik.999\n";
//        String regEx4 = "[A-Za-z]+\\.(\\d+)\\s";
//        Pattern pattern4 = Pattern.compile(regEx4);
//        Matcher matcher4 = pattern4.matcher(rec7);
//        int c = 0;
//        while (matcher4.find()) {
//            c++;
//            System.out.println("Occurrences : " + c + " : " + matcher4.group(1));
//            //challenge next
//            System.out.println("Occurrences : " + c + " : start at " + matcher4.start(1) + ": to " + (matcher4.end(1) - 1));
//        }

        //challenge next
//        String rec8 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
//        String regEx5 = "([0-9], [0-9]+)";
//        String tim5 = "\\{(.+?)\\}";//tim version escaping both curly braces and group all in with the (.+?)
//        String tim5a = "\\{(\\d+, \\d+)\\}";// modification for digits only
//        Pattern pattern5 = Pattern.compile(regEx5);
//        Matcher matcher5 = pattern5.matcher(rec8);
//        int a = 0;
//        while (matcher5.find()) {
//            a++;
//            System.out.println("Occurrences: " + a + " : " + matcher5.group(1));
//        }

//challenge next
        String rec9 = "11111";
//        String regEx9 = "^\\d{5}$";
//        Pattern pattern6 = Pattern.compile(regEx9);
//        Matcher matcher6 = pattern6.matcher(rec9);
//        System.out.println(matcher6.matches());
//        System.out.println(rec9.matches(regEx9));

        //challenge next
        String rec10 = "11111-1111";
        // System.out.println(rec10.matches("^\\d{5}-\\d{4}$"));
        //challenge next
        System.out.println(rec10.matches("^\\d{5}$|^\\d{5}-\\d{4}$"));
        System.out.println(rec9.matches("^\\d{5}$|^\\d{5}-\\d{4}$"));

        System.out.println(rec10.matches("^\\d{5}(-\\d{4})?$"));//tim version
        System.out.println(rec9.matches("^\\d{5}(-\\d{4})?$"));//tim version


    }//end main method
}
