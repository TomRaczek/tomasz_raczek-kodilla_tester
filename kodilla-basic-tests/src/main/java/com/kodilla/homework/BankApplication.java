package com.kodilla.homework;

public class BankApplication {
    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] cashMachines = {cashMachine1, cashMachine2, cashMachine3};

        Bank bank = new Bank(cashMachines);
        cashMachine1.add(1223);
        cashMachine1.add(-23122);
        cashMachine2.add(2312);
        System.out.println(bank.getTotalDeposits());
        System.out.println(bank.getTotalWithdrawals());
        System.out.println(bank.getTotalBalance());
    }
}