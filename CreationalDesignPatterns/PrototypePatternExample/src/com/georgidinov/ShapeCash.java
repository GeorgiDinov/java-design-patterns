package com.georgidinov;

import java.util.Hashtable;

public class ShapeCash {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cashedShape = shapeMap.get(shapeId);
        return (Shape) cashedShape.clone();
    }//end of method getShape

    public static void loadCash() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }//end of method loadCash

}//end of class ShapeCash
