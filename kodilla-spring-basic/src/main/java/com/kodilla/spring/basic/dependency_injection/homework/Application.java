package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService reliableDeliveryService = new TotallyReliableDeliveryService();
        NotificationService reliableNotificationService = new TotallyReliableNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(reliableDeliveryService, reliableNotificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}