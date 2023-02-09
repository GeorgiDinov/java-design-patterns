package com.georgidinov.codewars;

class Main {

    public static void main(String[] args) {
        System.out.println(solution(23));
    }

    private static int solution(int number) {
        int sum = 0;
        if (number < 3) {
            return -1;
        }
        for (int i = 3; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0))
                sum += i;
        }
        return sum;
    }
}
