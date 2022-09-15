package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
       List<Flight> flights = new ArrayList<>();
       flights.add(new Flight("Greferbergerstan", "Garafrygiburg"));
       flights.add(new Flight("Novigrad", "Touissant"));
       flights.add(new Flight("Novigrad", "Wyzima"));
       flights.add(new Flight("Khorinis", "Vengard"));
       flights.add(new Flight("Ishtar", "Vengard"));
       flights.add(new Flight("Trelis", "Vengard"));
       return flights;
    }
}