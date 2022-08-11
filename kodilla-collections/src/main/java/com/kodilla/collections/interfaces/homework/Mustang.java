package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mustang mustang = (Mustang) o;
        return speed == mustang.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Mustang{" +
                "speed=" + speed +
                '}';
    }
}