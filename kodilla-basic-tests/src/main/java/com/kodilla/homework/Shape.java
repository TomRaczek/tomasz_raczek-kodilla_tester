package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double height;

    private double base;

    public Shape(double height, double base) {

        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }


    public abstract void calculateArea();

    public abstract void calculateCircumference();
}