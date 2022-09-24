package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Order {

    private String login;
    private LocalDate orderDate;
    private double value;

    public Order(String login, LocalDate orderDate, double value) {
        this.login = login;
        this.orderDate = orderDate;
        this.value = value;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Order{" +
                "login='" + login + '\'' +
                ", orderDate=" + orderDate +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && Objects.equals(login, order.login) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, orderDate, value);
    }
}