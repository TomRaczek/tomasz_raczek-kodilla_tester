package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DeliveryService delivery, NotificationService notifications) {
        this.deliveryService = delivery;
        this.notificationService = notifications;
    }
    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}