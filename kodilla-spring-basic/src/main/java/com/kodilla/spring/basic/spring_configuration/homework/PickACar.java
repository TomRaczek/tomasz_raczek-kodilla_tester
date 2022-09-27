//package com.kodilla.spring.basic.spring_configuration.homework;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//@Configuration
//public class PickACar {
//
//    @Bean
//    public Car PickACar(LocalTime time, LocalDate date) {
//        Car car;
//        int month = date.getMonthValue();
//        if ((month == 12) || (month == 1) || (month == 2)) {
//            car = new SUV();
//        } else if ((month > 5) && (month < 9)) {
//            car = new Cabrio();
//        } else {
//            car = new Sedan();
//        }
//        return car;
//    }
//}
