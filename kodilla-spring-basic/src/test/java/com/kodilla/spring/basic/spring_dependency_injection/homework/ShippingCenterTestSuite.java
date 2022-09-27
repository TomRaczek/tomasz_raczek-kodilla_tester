package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldSucceedToSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sentPackage = bean.sendPackage("Greferbergerstan 12", 23);
        assertEquals("Package delivered to: Greferbergerstan 12", sentPackage);
    }
    @Test
    public void shouldFailToSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sentPackage = bean.sendPackage("Greferbergerstan 12", 33);
        assertEquals("Package not delivered to: Greferbergerstan 12", sentPackage);
    }
}