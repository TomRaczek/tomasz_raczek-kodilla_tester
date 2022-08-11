package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lada;
import com.kodilla.collections.interfaces.homework.Volvo;
import com.kodilla.collections.interfaces.homework.Mustang;

import java.util.Random;


public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }
    private static String getCarName(Car car) {
        if (car instanceof Lada)
            return "Lada";
        else if (car instanceof Mustang)
            return "Mustang";
        else if (car instanceof Volvo)
            return "Volvo";
        else
            return "Unknown car name";
    }
}
