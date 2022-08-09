package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int releaseYear;


    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void turnOn() {
        System.out.println("The system was turned on");
    }
    public void turnOff() {
        System.out.println("The system was turned off");
    }
}
