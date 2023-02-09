package com.georgidinov.codewars;

public class Task7 {
//    In this kata, you must create a digital root function.
//    A digital root is the recursive sum of all the digits in a number.
//    Given n, take the sum of the digits of n. If that value has more than one digit,
//    continue reducing in this way until a single-digit number is produced.
//    This is only applicable to the natural numbers.

//    digital_root(16)
//=> 1 + 6
//        => 7
//
//    digital_root(942)
//=> 9 + 4 + 2
//        => 15 ...
//        => 1 + 5
//        => 6
//
//    digital_root(132189)
//=> 1 + 3 + 2 + 1 + 8 + 9
//        => 24 ...
//        => 2 + 4
//        => 6
//
//    digital_root(493193)
//=> 4 + 9 + 3 + 1 + 9 + 3
//        => 29 ...
//        => 2 + 9
//        => 11 ...
//        => 1 + 1
//        => 2

    public static void main(String[] args) {
//        int n = 493193;
//        int sum = 0;
//
//        while (n > 0) {
//            sum += (n % 10);
//            n /= 10;
//        }
//        System.out.println(n % 10);
//        sum += (n % 10);
//        n /= 10;
//        System.out.println(n % 10);
//        sum += (n % 10);
//        n /= 10;
//        System.out.println(n % 10);
//        sum += (n % 10);
//        n /= 10;
//        System.out.println(n % 10);
//        sum += (n % 10);
        System.out.println(digital_root(132189));
        System.out.println(digitalRoot(132189));
        //int reminder = 500 % 9;
        //System.out.println(reminder);

    }//end of main method

    public static int digital_root(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return digital_root(sum);
    }

    //some other code
    public static int digitalRoot(int n) {
        return --n % 9 + 1;
    }
}//end of class Task7
