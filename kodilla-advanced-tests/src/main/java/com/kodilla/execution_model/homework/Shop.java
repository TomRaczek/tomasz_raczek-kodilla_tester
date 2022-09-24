package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.Date;
import java.util.stream.Collectors;

public class Shop {

    private HashSet<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersFromGivenPeriod(LocalDate firstDate, LocalDate secondDate) throws OrderNotFoundException, DatesIncorrectException {
        if (firstDate.isBefore(secondDate)) {
            List<Order> orders1 = this.orders
                    .stream()
                    .filter(order -> order.getOrderDate().compareTo(firstDate) >= 0 && order.getOrderDate()
                            .compareTo(secondDate) <= 0)
                    .collect(Collectors.toList());
            if (orders1.size() == 0) {
                throw new OrderNotFoundException();
            } else {
                return orders1;
            }
        } else {
            throw new DatesIncorrectException();
        }
    }

    public List<Order> getOrdersFormGivenValueRange(double firstValue, double secondValue) throws ValuesIncorrectException {
        if (firstValue < secondValue) {
            List<Order> orders2 = this.orders
                    .stream()
                    .filter(order -> order.getValue() > firstValue && order.getValue() < secondValue)
                    .collect(Collectors.toList());
            if (orders2.isEmpty()) {
                return null;
            } else {
                return orders2;
            }
        } else {
            throw new ValuesIncorrectException();
        }
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    public double getSumOfValues() {
        double sumOfValues =
                this.orders
                        .stream()
                        .map(Order::getValue).mapToDouble(Double::doubleValue).sum();
        return sumOfValues;
    }
}
