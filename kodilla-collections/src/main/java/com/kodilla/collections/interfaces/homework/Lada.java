package com.kodilla.collections.interfaces.homework;

public class Lada implements Car {

    private int speed = 0;

    @Override
    public int getSpeed() {
        return this.speed;
    }
    @Override
    public void increaseSpeed() {
        this.speed += 12;
    }
    @Override
    public void decreaseSpeed() {
        this.speed -= 10;
    }
    @Override
    public void setSpeed(int speed) {
        this.speed += speed;
    }
}