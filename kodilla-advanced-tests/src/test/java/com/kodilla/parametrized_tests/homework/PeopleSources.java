package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PeopleSources {

    static Stream<Arguments> providePeopleForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.78, 90.0),"Overweight"),
                Arguments.of(new Person(1.65, 45.3),"Underweight"),
                Arguments.of(new Person(2.01, 95.3),"Normal (healthy weight)"),
                Arguments.of(new Person(1.82, 123.4),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.54, 110.4),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.65, 110.1),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.71, 167.5),"Obese Class V (Super Obese)")
        );
    }
}
