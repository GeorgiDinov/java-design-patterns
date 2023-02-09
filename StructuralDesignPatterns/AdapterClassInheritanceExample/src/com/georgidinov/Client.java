package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class adapter returning " + ca1.getInteger());

        ObjectAdapter oa1 = new ObjectAdapter(new IntegerValue());
        System.out.println("Object adapter returning " + oa1.getInteger());

    }
}
