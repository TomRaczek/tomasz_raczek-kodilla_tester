package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public void setSpeed(int speed) {
        this.speed += speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volvo volvo = (Volvo) o;
        return speed == volvo.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "speed=" + speed +
                '}';
    }
}