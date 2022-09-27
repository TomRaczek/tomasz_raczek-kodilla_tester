//package com.kodilla.spring.basic.spring_configuration.homework;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class PickACarTestSuite {
//
//    @Test
//    public void shouldPickSuv() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        PickACar car = (PickACar) context.getBean(PickACar.class);
//        Car pickedCar = car.PickACar(LocalTime.parse("19:00"), LocalDate.parse("2018-11-27"));
//        String pickedCarName = pickedCar.getCarType();
//        Assertions.assertEquals("SUV", pickedCarName);
//    }
//}