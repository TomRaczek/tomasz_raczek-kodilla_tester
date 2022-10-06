package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class PickACar {


//    public Car garage(String season) {
//        Car car;
//        int month = date.getMonthValue();
//        if ((month == 12) || (month == 1) || (month == 2)) {
//            car = new SUV();
//        } else if ((month > 5) && (month < 9)) {
//            car = new Cabrio();
//        } else {
//            car = new Sedan();
//        }
//        return new SUV();
//    }
    @Bean
    @Scope(value = "prototype")
    public Car garage(LocalDate date) {
        Car car;
        int month = date.getMonthValue();
        if ((month == 12) || (month == 1) || (month == 2)) {
            car = new SUV();
        } else if ((month > 5) && (month < 9)) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }
}