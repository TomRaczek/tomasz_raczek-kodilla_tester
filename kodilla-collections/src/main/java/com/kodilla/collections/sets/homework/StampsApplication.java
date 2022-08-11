package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Flower", 3.0, true));
        stamps.add(new Stamp("Rock", 6.0, false));
        stamps.add(new Stamp("Sea", 4.0, false));
        stamps.add(new Stamp("Flower", 3.0, true));

        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}