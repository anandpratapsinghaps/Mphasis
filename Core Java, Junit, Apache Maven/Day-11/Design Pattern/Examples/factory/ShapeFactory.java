package com.example.factory;
class ShapeFactory {

    // Factory Method
    public Shape getShape(String type) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "circle":    return new Circle();
            case "square":    return new Square();
            case "rectangle": return new Rectangle();
            default:          return null;
        }
    }
}
