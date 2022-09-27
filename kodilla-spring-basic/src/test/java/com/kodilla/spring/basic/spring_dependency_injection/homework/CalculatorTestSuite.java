package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Optional;


@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldSumCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.add(4.0, 3.0);
        Assertions.assertEquals(Optional.of(7.0), Optional.of(value));
    }

    @Test
    public void shouldSubtractCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.subtract(4.0, 3.0);
        Assertions.assertEquals(Optional.of(1.0), Optional.of(value));
    }

    @Test
    public void shouldMultiplyCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.multiply(4.0, 3.0);
        Assertions.assertEquals(Optional.of(12.0), Optional.of(value));
    }

    @Test
    public void shouldDivideCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.divide(12.0, 3.0);
        Assertions.assertEquals(Optional.of(4.0), Optional.of(value));
    }

    @Test
    public void shouldDisplaySumCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean2 = context.getBean(Calculator.class);
        Display bean = context.getBean(Display.class);
        String value = bean.display(bean2.add(4.0, 3.0));
        Assertions.assertEquals("7.0", value);
    }

    @Test
    public void shouldDisplaySubtractResultCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean2 = context.getBean(Calculator.class);
        Display bean = context.getBean(Display.class);
        String value = bean.display(bean2.subtract(4.0, 3.0));
        Assertions.assertEquals("1.0", value);
    }

    @Test
    public void shouldDisplayMultiplyResultCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean2 = context.getBean(Calculator.class);
        Display bean = context.getBean(Display.class);
        String value = bean.display(bean2.multiply(4.0, 3.0));
        Assertions.assertEquals("12.0", value);
    }

    @Test
    public void shouldDisplayDivideResultCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean2 = context.getBean(Calculator.class);
        Display bean = context.getBean(Display.class);
        String value = bean.display(bean2.divide(12.0, 3.0));
        Assertions.assertEquals("4.0", value);
    }
}