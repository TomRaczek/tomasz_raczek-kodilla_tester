package com.kodilla.abstracts.homework;

public class ShapesApplication {
    public static void main(String[] args) {
        Shape rectangularTriangle = new RectangularTriangle();
        rectangularTriangle.calculateArea();

        Shape square = new Square();
        square.calculateCircumference();

        Shape rectangle = new Rectangle();
        rectangle.calculateArea();

    }
}