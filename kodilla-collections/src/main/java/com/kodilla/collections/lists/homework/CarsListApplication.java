package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
    public static void main(String[] args) {
        List<Volvo> cars = new ArrayList<>();
        Volvo volvo = new Volvo();
        cars.add(volvo);
        cars.add(volvo);
        cars.add(volvo);
        cars.add(volvo);
        cars.add(volvo);
        System.out.println(cars.size());

        for (Volvo car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(1);
        cars.remove(volvo);

        for (Volvo car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println(cars.size());
    }
}