package com.georgidinov.codewars;

public class Task5 {

//    Implement a method that accepts 3 integer values a, b, c.
//    The method should return true if a triangle can be built with
//    the sides of given length and false in any other case.
//    (In this case, all triangles must have surface greater than 0 to be accepted).


    public static void main(String[] args) {
        System.out.println(isTriangle(5,4,3));

    }//end of main method

    public static boolean isTriangle(int a, int b, int c) {
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            return 0.5d * (a + b + c) > 0;
        }
        return false;
    }

}//end of class Task5
