package com.georgidinov.codewars;

public class Task4 {
//    Given two integers a and b, which can be positive or negative,
//    find the sum of all the numbers between including them too and return it.
//    If the two numbers are equal return a or b.
//    Note: a and b are not ordered!

//    GetSum(1, 0) == 1   // 1 + 0 = 1
//    GetSum(1, 2) == 3   // 1 + 2 = 3
//    GetSum(0, 1) == 1   // 0 + 1 = 1
//    GetSum(1, 1) == 1   // 1 Since both are same
//    GetSum(-1, 0) == -1 // -1 + 0 = -1
//    GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2

    //formula to sum up to a number
    //n * (n + 1) / 2
    //(a + b) * (Math.abs(a - b) + 1) / 2;

    public static void main(String[] args) {
        System.out.println(GetSum(1, 10));
        System.out.println(Math.abs(1 - 10));
        System.out.println(3 * 2 / 2);
    }//end of main method

    public static int GetSum(int a, int b) {
        int low;
        int high;
        int sum = 0;
        if (a > b) {
            low = b;
            high = a;
        } else if (a < b) {
            low = a;
            high = b;
        } else {
            return a;
        }
        while (low <= high) {
            sum += low;
            low++;
        }
        return sum;
    }

}//end of class Task4
