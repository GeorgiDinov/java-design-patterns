package com.georgidinov.somestuff;

public class MaxSubstring {

   public static String maxSubstring(String s) {
        String result = "";
        if (s != null) {
            if ((s.length() >= 1) && (s.length() <= 100) && (s.matches("^[a-z]+"))) {
                for (int i = 0; i < s.length(); i++) {
                    if (result.compareTo(s.substring(i)) <= 0) {
                        result = s.substring(i);
                        System.out.println(result);
                    }
                }
            }else{
                return null;
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "aaabacdfggz";
        System.out.println(maxSubstring(str));
    }

}
