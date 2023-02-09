package com.georgidinov;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowCopyCashClass.loadData();
        ShallowCloneVariation georgi = ShallowCopyCashClass.getPerson("Georgi");
        ShallowCloneVariation mariya = ShallowCopyCashClass.getPerson("Mariya");

        System.out.println("Person: " + georgi.getName() + " age: " + georgi.getAge());
        System.out.println("Person: " + mariya.getName() + " age: " + mariya.getAge());

        FeMalePerson test = new FeMalePerson("Test", 12);
        FeMalePerson testCopy = test.clone();
        Arrays.stream(testCopy.getFeMaleThings()).forEach(System.out::print);
        System.out.println("\n"+testCopy.getGarbageInfo());

    }//end of main method

}//end of class Main
