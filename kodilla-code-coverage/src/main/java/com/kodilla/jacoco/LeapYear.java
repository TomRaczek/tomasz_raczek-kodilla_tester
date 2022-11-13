package com.kodilla.jacoco;

public class LeapYear {
    int input;

    public LeapYear(int year) {
        this.input = year;
    }

    public boolean isLeap() {
        if (this.input % 4 == 0) {
            if (this.input % 100 == 0) {
                return this.input % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}