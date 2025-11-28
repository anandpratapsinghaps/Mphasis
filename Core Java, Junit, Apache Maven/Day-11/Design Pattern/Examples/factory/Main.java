package com.example.factory;
public class Main {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("circle");
        shape1.draw();

        Shape shape2 = factory.getShape("square");
        shape2.draw();

        Shape shape3 = factory.getShape("rectangle");
        shape3.draw();
    }
}
