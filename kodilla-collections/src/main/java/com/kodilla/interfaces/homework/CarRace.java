package com.kodilla.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car volvo = new Volvo();
        Car lada = new Lada();
        Car mustang = new Mustang();
        doRace(volvo);
        doRace(lada);
        doRace(mustang);

    }
    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}