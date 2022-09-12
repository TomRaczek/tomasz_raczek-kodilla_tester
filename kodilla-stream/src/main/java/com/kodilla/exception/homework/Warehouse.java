package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> requestedOrder = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .collect(Collectors.toList());
        if (requestedOrder.size() == 0) {
            throw new OrderDoesntExistException();
        } else {
            return requestedOrder.get(0);
        }
    }
}