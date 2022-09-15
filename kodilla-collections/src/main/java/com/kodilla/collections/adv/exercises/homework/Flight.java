package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {

    private String departure;

    private String arrival;

    public Flight (String departure, String arrival) {
        this.arrival = arrival;
        this.departure = departure;

    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Flight flight = (Flight) o;
        return this.arrival.equals(flight.arrival)
                && this.departure.equals(flight.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrival, departure);
    }

    @Override
    public String toString() {
        return "Details of flight" + arrival + ", " + departure;
    }
}
