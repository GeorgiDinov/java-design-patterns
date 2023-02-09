package com.georgidinov.codewars;

public class Task6 {


//    Write a function that takes an integer as input,
//    and returns the number of bits that are equal to one in the binary representation of that number.
//    You can guarantee that input is non-negative.
//    Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


    public static void main(String[] args) {
        System.out.println(countBits(1234));
        System.out.println(Integer.bitCount(1234));
        System.out.println(javaIntegerClassBitCountMethod(1234));
    }//end of main method


    public static int countBits(int n) {
        int counter = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                counter++;
            }
            n /= 2;
        }
        return counter;
    }

    private static int javaIntegerClassBitCountMethod(int i){
        // HD, Figure 5-2
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        return i & 0x3f;
    }

}//end of class Task6
