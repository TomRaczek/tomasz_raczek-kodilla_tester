package com.kodilla.homework;

public class Bank {
    CashMachine[] listOfMachines;

    public Bank(CashMachine[] listOfMachines) {
        this.listOfMachines = listOfMachines;
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (int i = 0; i < this.listOfMachines.length; i++) {
            totalBalance += this.listOfMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int getTotalWithdrawals() {
        int totalWithdrawals = 0;
        for (int i = 0; i < this.listOfMachines.length; i++) {
            totalWithdrawals += this.listOfMachines[i].getNumberOfWithdrawals();
        }
        return totalWithdrawals;
    }

    public int getTotalDeposits() {
        int totalDeposits = 0;
        for (int i = 0; i < this.listOfMachines.length; i++) {
            totalDeposits += this.listOfMachines[i].getNumberOfDeposits();
        }
        return totalDeposits;
    }

    public double getAverageDeposit() {
        if (this.listOfMachines.length == 0) {
            return 0;
        } else {
            int sumOfDeposits = 0;
            int count = 0;
            for (int i = 0; i < this.listOfMachines.length; i++) {
                int[] values = this.listOfMachines[i].getValues();
                for (int j = 0; j < this.listOfMachines[i].getValues().length; j++) {
                    if (values[j] > 0) {
                        sumOfDeposits += values[j];
                        count++;
                    }
                }
            }
            if (count == 0) {
                return 0;
            } else {
                return sumOfDeposits / count;
            }
        }
    }

    public double getAverageWithdrawal() {
        int sumOfWithdrawals = 0;
        int count = 0;
        for (int k = 0; k < this.listOfMachines.length; k++) {
            for (int l = 0; l < this.listOfMachines[k].getValues().length; l++) {
                if ( this.listOfMachines[k].getValues()[l] < 0) {
                     sumOfWithdrawals += this.listOfMachines[k].getValues()[l];
                     count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sumOfWithdrawals / count;
        }
    }
}