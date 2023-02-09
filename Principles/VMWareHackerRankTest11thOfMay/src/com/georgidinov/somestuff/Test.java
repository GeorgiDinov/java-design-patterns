package com.georgidinov.somestuff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test extends Main {

    public static void test() {
        List b = new LinkedList<Character>();
        List<?> e = new ArrayList<>();
        List<Number> a = new ArrayList<>();

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.fun();
    }


    public void fun() {
        String x = null;
        Object y = 1;
        magic(x, y);
        System.out.println("x after magic = " + x);
        System.out.println("y after magic = " + y);
    }

    private void magic(Object x, Object y) {
        Object temp = x;
        System.out.println("temp = " + temp);
        x = y;
        System.out.println("x = " + x);
        y = temp;
        System.out.println("y = " + y);
    }

}
