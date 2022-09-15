package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    public void testAveragePostsAbove39() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 732, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 48, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 1164, "Manager"));
        users.add(new User("Gus Firing", 49, 454, "Board"));
        users.add(new User("Gale Boetticher", 44, 778, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 332, "Security"));
        double testAveragePostsAbove39 = ForumStats.averagePostsAboveAge39(users);
        assertEquals(574, testAveragePostsAbove39);
    }

    @Test
    public void testAveragePostsBelow40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 732, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 48, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 1164, "Manager"));
        users.add(new User("Gus Firing", 49, 454, "Board"));
        users.add(new User("Gale Boetticher", 44, 778, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 332, "Security"));
        double testAveragePostsBelow40 = ForumStats.averagePostsBelowAge40(users);
        assertEquals(606, testAveragePostsBelow40);
    }

    @Test
    public void shouldReturn0IfListIsEmpty() {
        List<User> users = new ArrayList<>();
        double testAverageAgeIfEmpty = ForumStats.averagePostsAboveAge39(users);
        assertEquals(0, testAverageAgeIfEmpty);
    }

    @Test
    public void shouldReturn0IfThereAreNoPeopleAbove39() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 19, 732, "Chemists"));
        users.add(new User("Jessie Pinkman", 19, 48, "Sales"));
        users.add(new User("Tuco Salamanca", 19, 1164, "Manager"));
        users.add(new User("Gus Firing", 19, 454, "Board"));
        users.add(new User("Gale Boetticher", 19, 778, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 19, 332, "Security"));
        double testAveragePostsAbove39 = ForumStats.averagePostsAboveAge39(users);
        assertEquals(0, testAveragePostsAbove39);
    }
    @Test
    public void shouldReturn0IfThereAreNoPeopleBelow40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 69, 732, "Chemists"));
        users.add(new User("Jessie Pinkman", 69, 48, "Sales"));
        users.add(new User("Tuco Salamanca", 69, 1164, "Manager"));
        users.add(new User("Gus Firing", 69, 454, "Board"));
        users.add(new User("Gale Boetticher", 69, 778, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 69, 332, "Security"));
        double testAveragePostsAbove39 = ForumStats.averagePostsBelowAge40(users);
        assertEquals(0, testAveragePostsAbove39);
    }
}