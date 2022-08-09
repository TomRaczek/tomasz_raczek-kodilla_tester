package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(2,12);
    }

    @Override
    public void calculateArea() {
        double area = base * height;
        System.out.println(area);

    }

    @Override
    public void calculateCircumference() {
        double circumference = base * height;
        System.out.println(circumference);
    }
}