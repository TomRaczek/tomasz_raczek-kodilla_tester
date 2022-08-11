package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lada lada = (Lada) o;
        return speed == lada.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Lada{" +
                "speed=" + speed +
                '}';
    }
}