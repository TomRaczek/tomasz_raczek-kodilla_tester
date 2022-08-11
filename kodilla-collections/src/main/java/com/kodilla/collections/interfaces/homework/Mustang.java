package com.kodilla.collections.interfaces.homework;

public class Mustang implements Car {

    private int speed = 0;

    @Override
    public int getSpeed() {
        return this.speed;
    }
    @Override
    public void increaseSpeed() {
        this.speed += 30;
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