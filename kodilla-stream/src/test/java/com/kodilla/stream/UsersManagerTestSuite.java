package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuite {

    @Test
    public void shouldReturnCorrectUsernamesOfChemists() {
        List<String> chemists = UsersManager.filterChemistGroupUsernames();
        List<String> expectedChemists = new ArrayList<>();
        expectedChemists.add("Walter White");
        expectedChemists.add("Gale Boetticher");
        assertArrayEquals(new List[]{expectedChemists}, new List[]{chemists});
    }
    @Test
    public void shouldReturnUsersOlderThan30() {
        List<String> olderThan30 = UsersManager.filterUsersOlderThan30();
        List<String> expectedOlderThan30 = new ArrayList<>();
        expectedOlderThan30.add("Walter White");
        expectedOlderThan30.add("Tuco Salamanca");
        expectedOlderThan30.add("Gus Firing");
        expectedOlderThan30.add("Gale Boetticher");
        expectedOlderThan30.add("Mike Ehrmantraut");
        assertEquals(expectedOlderThan30, olderThan30);
    }
    @Test
    public void shouldReturnUserWithNumberOfPosts0() {
        List<String> numberOfPost0 = UsersManager.filterUsersWithNumberOfPost0();
        List<String> expectedNumberOfPost0 = new ArrayList<>();
        expectedNumberOfPost0.add("Gus Firing");
        expectedNumberOfPost0.add("Mike Ehrmantraut");
        assertEquals(expectedNumberOfPost0, numberOfPost0);
    }
}