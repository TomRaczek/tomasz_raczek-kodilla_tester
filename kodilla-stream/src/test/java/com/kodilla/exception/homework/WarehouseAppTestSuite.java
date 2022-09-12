package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {
    @Test
    public void shouldThrowExceptionWhenOrderDoesNotExist() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1","Halva"));
        warehouse.addOrder(new Order("2", "Pavlova"));
        warehouse.addOrder(new Order("3", "Medovik"));
        warehouse.addOrder(new Order("4", "Kompot"));
        warehouse.addOrder(new Order("5", "Baklava"));
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("6"));
    }
}