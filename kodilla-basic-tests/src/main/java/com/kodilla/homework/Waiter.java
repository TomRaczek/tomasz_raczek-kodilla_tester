package com.kodilla.abstracts.homework;

public class Waiter extends Job{
    private static String responsibilities;

    private static int salary;

    public Waiter() {
        super("Serves meals", 3000);
    }

    @Override
    public String getResponsibilities() {
        System.out.println("Serves meals");
        return null;
    }

    @Override
    public int getSalary() {
        System.out.println(3000);
        return 0;
    }
}
