package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherNotificationServiceTestSuite {

    NotificationClient client = Mockito.mock(NotificationClient.class);
    NotificationClient client2 = Mockito.mock(NotificationClient.class);
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    @Test
    public void notSubscribedClientShouldNotReceiveNotificationFromNotSubscribedRegion() {
        weatherNotificationService.sendWeatherNotification("Cracow");
        weatherNotificationService.addWeatherSubscriber(client, "Warsaw");
        Mockito.verify(client, Mockito.never()).receiveWeatherNotification();
    }

    @Test
    public void subscribedClientShouldReceiveNotificationFromSubscribedRegion() {
        weatherNotificationService.addWeatherSubscriber(client, "Cracow");
        weatherNotificationService.sendWeatherNotification("Cracow");
        Mockito.verify(client).receiveWeatherNotification();
    }

    @Test
    public void NewsletterNotificationShouldBeSentToAllSubscribedClients() {
        weatherNotificationService.addWeatherSubscriber(client, "Cracow");
        weatherNotificationService.sendNewsletter();
        Mockito.verify(client).receiveNewsletter();
    }
    @Test
    public void shouldSendOnlyOneNewsletterNotificationToMultiTimeSubscriber() {
        weatherNotificationService.addWeatherSubscriber(client, "Cracow");
        weatherNotificationService.addWeatherSubscriber(client, "Warsaw");
        weatherNotificationService.sendNewsletter();
        Mockito.verify(client, Mockito.times(1)).receiveNewsletter();
    }
    @Test
    public void weatherNotificationShouldOnlyReachClientsSubscribedToRegion() {
        weatherNotificationService.addWeatherSubscriber(client, "Cracow");
        weatherNotificationService.addWeatherSubscriber(client2, "Warsaw");
        weatherNotificationService.sendWeatherNotification("Cracow");
        Mockito.verify(client2, Mockito.never()).receiveWeatherNotification();
    }

    @Test
    public void clientUnsubscribedFromLocationShouldNotReceiveWeatherNotification() {
        weatherNotificationService.addWeatherSubscriber(client, "Cracow");
        weatherNotificationService.removeSubscriptionFromLocalization(client, "Cracow");
        weatherNotificationService.sendWeatherNotification("Cracow");
        Mockito.verify(client, Mockito.never()).receiveWeatherNotification();
    }
    @Test
    public void unsubscribedClientShouldNotReceiveAnyNotifications() {
        weatherNotificationService.addWeatherSubscriber(client, "Cracow");
        weatherNotificationService.removeSubscriber(client);
        weatherNotificationService.sendNewsletter();
        weatherNotificationService.sendWeatherNotification("Cracow");
        Mockito.verify(client, Mockito.never()).receiveWeatherNotification();
        Mockito.verify(client, Mockito.never()).receiveNewsletter();
    }
    @Test
    public void shouldDeleteLocalization() {
        weatherNotificationService.addWeatherSubscriber(client, "Cracow");
        weatherNotificationService.removeLocalization("Cracow");
        weatherNotificationService.sendWeatherNotification("Cracow");
        Mockito.verify(client, Mockito.never()).receiveWeatherNotification();
    }
}