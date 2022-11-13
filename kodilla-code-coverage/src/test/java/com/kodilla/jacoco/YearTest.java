package com.kodilla.jacoco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {16, 1600} )
    void shouldBeLeap() {

        //given
        LeapYear year = new LeapYear(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @ParameterizedTest
    @ValueSource(ints = {2022, 3, 100} )

    void shouldNotBeLeap(int number) {

        //given
        LeapYear year = new LeapYear(number);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }
}