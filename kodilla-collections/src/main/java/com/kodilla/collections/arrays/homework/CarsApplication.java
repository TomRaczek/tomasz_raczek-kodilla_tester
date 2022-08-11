package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lada;
import com.kodilla.collections.interfaces.homework.Volvo;
import com.kodilla.collections.interfaces.homework.Mustang;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();
    private static final Random RANDOM1 = new Random();
    private static final Random RANDOM2 = new Random();

    public static void main(String[] args) {
        int t = RANDOM1.nextInt(15 + 1);
        Car[] cars = new Car[t];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    private static Car drawCar() {
        int drawnCar = RANDOM.nextInt(3);
        int y = RANDOM2.nextInt(100 +1);
        if (drawnCar == 0) {
            Car volvo = new Volvo();
            volvo.setSpeed(y);
            return volvo;
        }
        else if (drawnCar == 1) {
            Car lada = new Lada();
            lada.setSpeed(y);
            return lada;
        } else {
            Car mustang = new Mustang();
            mustang.setSpeed(y);
            return mustang;
        }
    }
}