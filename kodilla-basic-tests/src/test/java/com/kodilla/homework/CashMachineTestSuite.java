package com.kodilla.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddThreeElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(400);
        cashMachine.add(100);
        cashMachine.add(500);

        int[] values = cashMachine.getValues();
        assertEquals(3, values.length);
        assertEquals(400, values[0]);
        assertEquals(100, values[1]);
        assertEquals(500, values[2]);
    }

    @Test
    public void shouldCalculateAverageDeposit() {
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachinesArray = {cashMachine};
        Bank bank = new Bank(cashMachinesArray);
        cashMachine.add(400);
        cashMachine.add(200);
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(-300);
        assertEquals(400, bank.getAverageDeposit(), 0.00001);
    }

    @Test
    public void shouldCalculateAverageWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachinesArray = {cashMachine};
        Bank bank = new Bank(cashMachinesArray);
        cashMachine.add(400);
        cashMachine.add(200);
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(-300);
        assertEquals(-250, bank.getAverageWithdrawal(), 0.00001);
    }

    @Test
    public void shouldReturnZeroIsCashMachineIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachinesArray = {cashMachine};
        Bank bank = new Bank(cashMachinesArray);
        assertEquals(0, bank.getAverageDeposit(), 0.00001);
        assertEquals(0, bank.getAverageWithdrawal(), 0.00001);
        assertEquals(0, bank.getTotalBalance(), 0.00001);
        assertEquals(0, bank.getTotalDeposits(), 0.00001);
        assertEquals(0, bank.getTotalWithdrawals(), 0.00001);
        assertEquals(0, cashMachine.getNumberOfTransactions(), 0.00001);
    }

    @Test
    public void shouldReturnTotalBalance() {
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachinesArray = {cashMachine};
        Bank bank = new Bank(cashMachinesArray);
        cashMachine.add(400);
        cashMachine.add(200);
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(-300);
        assertEquals(700, bank.getTotalBalance(), 0.00001);
    }

    @Test
    public void shouldReturnTotalDeposits() {
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachinesArray = {cashMachine};
        Bank bank = new Bank(cashMachinesArray);
        cashMachine.add(400);
        cashMachine.add(200);
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(-300);
        assertEquals(3, bank.getTotalDeposits());
    }

    @Test
    public void shouldReturnTotalWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        CashMachine[] cashMachinesArray = {cashMachine};
        Bank bank = new Bank(cashMachinesArray);
        cashMachine.add(400);
        cashMachine.add(200);
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(-300);
        assertEquals(2, bank.getTotalWithdrawals());
    }
}