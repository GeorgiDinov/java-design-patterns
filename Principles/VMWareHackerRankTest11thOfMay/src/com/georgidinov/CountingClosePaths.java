package com.georgidinov;

class CountingClosePaths {


    public static int closedPaths(int number) {
        int sum = 0;
        if (checkConstraints(number)) {
            while (number != 0) {
                sum += pathValue(number % 10);
                number /= 10;
            }
        }
        return sum;
    }//end of method closedPaths

    public static int pathValue(int number) {
        switch (number) {
            case 0:
            case 4:
            case 6:
            case 9:
                return 1;
            case 8:
                return 2;
            default:
                return 0;
        }
    }//end of method pathValue


    public static boolean checkConstraints(int number) {
        return number >= 1 && number <= Math.pow(10, 9);
    }//end of method checkConstraints

}//end of class
