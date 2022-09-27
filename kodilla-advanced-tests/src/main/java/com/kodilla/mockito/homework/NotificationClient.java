package com.kodilla.mockito.homework;

public interface NotificationClient {
    void receiveNewsletter(Newsletter newsletterNotification);

    void receiveWeatherNotification(WeatherNotification weatherNotification);
}