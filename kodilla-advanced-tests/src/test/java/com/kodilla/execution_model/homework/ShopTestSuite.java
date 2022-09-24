package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    public void initializeOrder() {
        shop.addOrder(new Order("carrot", LocalDate.of(2019,5,20),2002.0));
        shop.addOrder(new Order("beet", LocalDate.of(2021,12,18),1223.0));
        shop.addOrder(new Order("parsnip", LocalDate.of(2022,3,1),500.0));
        shop.addOrder(new Order("leek", LocalDate.of(2018,1,22),300.0));
        shop.addOrder(new Order("onion", LocalDate.of(2020,7,12),102.0));
        shop.addOrder(new Order("garlic", LocalDate.of(2022,8,2),54.0));
    }
    @Test
    public void shouldAddOrdersToSet() {
        initializeOrder();
        int numberOfOrders = shop.getNumberOfOrders();
        assertEquals(6, numberOfOrders);
    }
    @Test
    public void shouldReturnOrdersFromGivenPeriodIfDatesAreCorrect() throws OrderNotFoundException, DatesIncorrectException {
        List<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(new Order("beet", LocalDate.of(2021,12,18),1223.0));
        expectedOrders.add(new Order("onion", LocalDate.of(2020,7,12),102.0));
        initializeOrder();
        List<Order> providedOrders = shop.getOrdersFromGivenPeriod(LocalDate.of(2020,1,1),
                LocalDate.of(2022,1,1));
        assertEquals(expectedOrders, providedOrders);
    }

    @Test
    public void shouldThrowExceptionIfDatesAreIncorrect() throws OrderNotFoundException, DatesIncorrectException {
        initializeOrder();
        assertThrows(DatesIncorrectException.class, () -> shop.getOrdersFromGivenPeriod
                ((LocalDate.of(2001,1,1)), LocalDate.of(2000,1,1)));
    }
    @Test
    public void shouldThrowExceptionIfThereAreNoOrdersInGivenPeriod() throws OrderNotFoundException, DatesIncorrectException {
        initializeOrder();
        assertThrows(OrderNotFoundException.class, () -> shop.getOrdersFromGivenPeriod
            ((LocalDate.of(1998, 1,1)), LocalDate.of(1999, 1, 1)));
    }
    @Test
    public void shouldReturnOrdersFormGivenValueRange() throws ValuesIncorrectException {
        initializeOrder();
        List<Order> expectedOrders2 = new ArrayList<>();
        expectedOrders2.add(new Order("leek", LocalDate.of(2018,1,22),300.0));
        expectedOrders2.add(new Order("parsnip", LocalDate.of(2022,3,1),500.0));
        List<Order> providedOrders = shop.getOrdersFormGivenValueRange(200.0, 600.0);
        assertEquals(expectedOrders2, providedOrders);
    }
    @Test
    public void shouldReturnNullIfNoOrdersInGivenValueRangeAreFound() throws ValuesIncorrectException {
        initializeOrder();
        assertNull(shop.getOrdersFormGivenValueRange(12.0, 13.0));
    }
    @Test
    public void shouldReturnCorrectNumberOfOrders() {
        initializeOrder();
        assertEquals(6, shop.getNumberOfOrders());
    }
    @Test
    public void shouldReturnCorrectSumOfValues() {
        initializeOrder();
        assertEquals(4181.0, shop.getSumOfValues());
    }
    @Test
    public void shouldReturnSumOfValues0IfThereAreNoOrders() {
        assertEquals(0, shop.getSumOfValues());
    }
}