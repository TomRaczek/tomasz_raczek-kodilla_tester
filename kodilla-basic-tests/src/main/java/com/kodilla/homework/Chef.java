package com.kodilla.abstracts.homework;

public class Chef extends Job{


    public Chef() {
        super("Cooks meals", 4000);
    }
    private static String responsibilities;

    private static int salary;


    @Override
    public String getResponsibilities() {
        return Chef.responsibilities;
    }

    @Override
    public int getSalary() {
        return Chef.salary;
    }
}
