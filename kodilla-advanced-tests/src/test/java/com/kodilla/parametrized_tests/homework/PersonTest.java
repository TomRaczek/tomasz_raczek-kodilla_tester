package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PeopleSources#providePeopleForTestingBMI")
    public void shouldGetCorrectBMI(Person input, String expected) {
        assertEquals(expected, input.getBMI());
    }
}