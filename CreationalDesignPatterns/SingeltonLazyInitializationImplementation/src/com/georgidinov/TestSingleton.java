package com.georgidinov;

import org.w3c.dom.css.CSSImportRule;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        s.setData(55);
        System.out.println("first instance = "+s);
        System.out.println("data = "+s.getData());

        s =null;
        s = Singleton.getInstance();
        System.out.println("second instance = "+s);
        System.out.println("data = "+s.getData());
    }
}
