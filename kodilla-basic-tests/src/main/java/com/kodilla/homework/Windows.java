package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int releaseYear) {

        super(releaseYear = 1985);
    }
    @Override
    public void turnOn () {
        System.out.println("Download the update first");

    }
}
