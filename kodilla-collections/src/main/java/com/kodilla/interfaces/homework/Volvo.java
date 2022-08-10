package com.kodilla.interfaces.homework;

public class Volvo implements Car {

    private int speed = 0;

    @Override
    public int getSpeed() {
        return this.speed;
    }
    @Override
    public void increaseSpeed() {
        this.speed += 20;
    }
    @Override
    public void decreaseSpeed() {
        this.speed -= 10;
    }
}