package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PickACarTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    PickACar car = (PickACar) context.getBean(PickACar.class);
    @Test
    public void shouldPickSuv() {
        Car pickedCar = car.garage(LocalDate.parse("2022-12-12"));
        String pickedCarName = pickedCar.getCarType();
        Assertions.assertEquals("SUV", pickedCarName);
    }
    @Test
    public void shouldPickSedan() {
        Car pickedCar = car.garage(LocalDate.parse("2022-04-12"));
        String pickedCarName = pickedCar.getCarType();
        Assertions.assertEquals("Sedan", pickedCarName);
    }
    @Test
    public void shouldPickCabrio() {
        Car pickedCar = car.garage(LocalDate.parse("2022-06-12"));
        String pickedCarName = pickedCar.getCarType();
        Assertions.assertEquals("Cabrio", pickedCarName);
    }
    @Test
    public void shouldHaveLightsOn() {
        Car pickedCar = car.garage(LocalDate.parse("2022-12-12"));
        Boolean lights = pickedCar.hasHeadlightsTurnedOn(LocalTime.parse("21:00:00"));
        Assertions.assertTrue(lights);
    }
    @Test
    public void shouldHaveLightsOff() {
        Car pickedCar = car.garage(LocalDate.parse("2022-06-12"));
        Boolean lights = pickedCar.hasHeadlightsTurnedOn(LocalTime.parse("12:00:00"));
        Assertions.assertFalse(lights);
    }
}