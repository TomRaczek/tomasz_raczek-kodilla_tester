package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1","Halva"));
        warehouse.addOrder(new Order("2", "Pavlova"));
        warehouse.addOrder(new Order("3", "Medovik"));
        warehouse.addOrder(new Order("4", "Kompot"));
        warehouse.addOrder(new Order("5", "Baklava"));
        try {
            warehouse.getOrder("6");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found");
        }
    }
}