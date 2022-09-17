package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv")
    public void shouldReturnTrueIfNumbersAreCorrect(String input) throws InvalidNumbersException {
        Set<Integer> integers = new HashSet<>();
        String[] strings = input.split(" ");
        for (String s : strings)
            integers.add(Integer.parseInt(s));
        int result = gamblingMachine.howManyWins(integers);
        assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectNumbers.csv")
    public void shouldReturnFalseIfNumbersAreIncorrect(String input) {
        Set<Integer> integers = new HashSet<>();
        String[] strings = input.split(" ");
        for (String s : strings)
            integers.add(Integer.parseInt(s));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(integers));
    }
}