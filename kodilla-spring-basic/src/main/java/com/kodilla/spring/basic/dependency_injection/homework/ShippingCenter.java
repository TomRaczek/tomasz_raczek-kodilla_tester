package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter implements NotificationService, DeliveryService {

    private ShippingCenter shippingCenter;

    public void sendPackage(String address, double weight) {
        if (shippingCenter.deliverPackage(address, weight)) {
            shippingCenter.success(address);
        } else {
            shippingCenter.fail(address);
        }
    }

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }

    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}