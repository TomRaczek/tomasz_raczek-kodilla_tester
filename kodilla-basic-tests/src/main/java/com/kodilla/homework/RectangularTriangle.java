package com.kodilla.abstracts.homework;

public class RectangularTriangle extends Shape{

    public RectangularTriangle() {
        super(4,5);

    }

    @Override
    public void calculateArea() {
    double area = height * base * 0.5;
    System.out.println(area);
    }

    @Override
    public void calculateCircumference() {
    double hypotenuse = Math.sqrt((height * height)+(base*base));
    double circumference = height + base + hypotenuse;
    System.out.println(circumference);
    }
}