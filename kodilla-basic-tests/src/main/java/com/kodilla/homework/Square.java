package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private Square() {
        super(8, 8);
    }

    @Override
    public void calculateArea() {
        double area = base * base;
        System.out.println(area);
    }

    @Override
    public void calculateCircumference() {
        double circumference = height * 4;
        System.out.println(circumference);
    }
}