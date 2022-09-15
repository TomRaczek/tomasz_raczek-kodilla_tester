package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void shouldReturnFlightsFromNovigrad() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> expectedFlightsFromNovigrad = new ArrayList<>();
        expectedFlightsFromNovigrad.add(new Flight("Novigrad", "Touissant"));
        expectedFlightsFromNovigrad.add(new Flight("Novigrad", "Wyzima"));
        List<Flight> flightsFromNovigrad =
                flightFinder.findFlightsFrom("Novigrad");
        assertEquals(expectedFlightsFromNovigrad, flightsFromNovigrad);
    }
    @Test
    public void shouldReturnEmptyListIfCityDoesNotExist() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromCracov =
        flightFinder.findFlightsFrom("Cracov");
        assertEquals(0, flightsFromCracov.size());
    }
    @Test
    public void shouldReturnFlightsToVengard() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> expectedFlightsToVengard = new ArrayList<>();
        expectedFlightsToVengard.add(new Flight("Khorinis", "Vengard"));
        expectedFlightsToVengard.add(new Flight("Ishtar", "Vengard"));
        expectedFlightsToVengard.add(new Flight("Trelis", "Vengard"));
        List<Flight> flightsToVengard =
                flightFinder.findFlightsTo("Vengard");
        assertEquals(expectedFlightsToVengard, flightsToVengard);
    }
}