package com.kodilla.homework;

public class CashMachine {

    private int[] values;
    private int size;
    private int numberOfTransactions;
    private int numberOfDeposits;
    private int numberOfWithdrawals;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
        this.numberOfTransactions = 0;
        this.numberOfDeposits = 0;
        this.numberOfWithdrawals = 0;
    }

    public void add(int value) {
        this.size++;
        this.numberOfTransactions++;
        if (value > 0) {
            this.numberOfDeposits++;
        } else if (value < 0) {
            this.numberOfWithdrawals++;
        } else {
            return;
        }
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }
    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < this.size; i++) {
            balance += this.values[i];
        }
        return balance;
    }

    public int[] getValues() {
        return values;
    }
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }
}