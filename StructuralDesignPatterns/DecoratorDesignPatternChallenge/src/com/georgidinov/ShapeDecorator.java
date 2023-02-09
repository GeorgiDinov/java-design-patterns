package com.georgidinov;

public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape sh) {
        this.shape = sh;
    }

    @Override
    public void draw() {
        this.shape.draw();
    }

}//end of abstract class ShapeDecorator

class BorderColorDecorator extends ShapeDecorator {
    String borderColor;

    public BorderColorDecorator(Shape sh, String color) {
        super(sh);
        this.borderColor = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border color: " + this.borderColor);
    }
}//end of BorderColorDecorator

//class RectangleBorderDecorator extends ShapeDecorator {
//    private String color;
//
//    public RectangleBorderDecorator(Shape sh, String color) {
//        super(sh);
//        this.color = color;
//    }
//
//    @Override
//    public void draw() {
//        System.out.println("Rectangle with " + this.color + " border");
//        super.draw();
//        System.out.println("Border color: " + this.color);
//    }
//}
//
//class CircleBorderDecorator extends ShapeDecorator {
//    private String color;
//
//    public CircleBorderDecorator(Shape sh, String color) {
//        super(sh);
//        this.color = color;
//    }
//
//    @Override
//    public void draw() {
//        System.out.println("Circle with " + this.color + " border");
//        super.draw();
//        System.out.println("Border color: " + this.color);
//    }
//}