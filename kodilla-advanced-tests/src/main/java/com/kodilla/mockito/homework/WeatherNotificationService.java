package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;

public class WeatherNotificationService {
    public WeatherNotificationService() {
        this.memberList.put("Cracow", new HashSet<>());
        this.memberList.put("Warsaw", new HashSet<>());
    }
    HashMap<String, HashSet<NotificationClient>> memberList = new HashMap<>();
    HashSet<NotificationClient> allNotificationsClientList = new HashSet<>();

    public void addWeatherSubscriber(NotificationClient client, String localization) {
        if (memberList.containsKey(localization)) {
            memberList.get(localization).add(client);
            allNotificationsClientList.add(client);
        }
    }
    public void sendWeatherNotification(String localization) {
        if (memberList.containsKey(localization)) {
            memberList
                    .get(localization)
                    .forEach(NotificationClient::receiveWeatherNotification);
        }
    }
    public void removeSubscriptionFromLocalization(NotificationClient client, String localization){
        memberList.get(localization).remove(client);
    }
    public void removeSubscriber(NotificationClient client) {
        for (String localization: memberList.keySet()) {
            memberList.get(localization).remove(client);
        }
        allNotificationsClientList.remove(client);
    }
    public void sendNewsletter() {
        allNotificationsClientList
                .forEach(NotificationClient::receiveNewsletter);
    }
    public void removeLocalization(String localization) {
        memberList.remove(localization);
    }
}