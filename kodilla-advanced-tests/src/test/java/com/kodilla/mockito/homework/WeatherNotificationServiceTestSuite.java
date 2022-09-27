package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherNotificationServiceTestSuite {

    @Test
    public void notSubscribedClientShouldNotReceiveNotificationFromNotSubscribedRegion() {
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        NotificationClient client = Mockito.mock(NotificationClient.class);
        WeatherNotification notification = Mockito.mock(WeatherNotification.class);

        weatherNotificationService.sendWeatherNotification(notification);
        Mockito.verify(client, Mockito.never()).receiveWeatherNotification(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotificationFromSubscribedRegion() {
    }
    @Test
    public void NewsletterNotificationShouldBeSentToAllSubscribedClients() {
    }
    @Test
    public void shouldSendOnlyOneNewsletterNotificationToMultiTimeSubscriber() {
    }
    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
    }
}