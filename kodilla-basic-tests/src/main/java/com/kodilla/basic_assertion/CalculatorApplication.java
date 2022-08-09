package com.kodilla.basic_assertion;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator1.sum(a, b);
        boolean sumCorrect = ResultChecker.assertEquals(13, sumResult);
        if (sumCorrect) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        Calculator calculator2 = new Calculator();
        int c = 9;
        int d = 4;
        int subtractResult = calculator2.subtract(c,d);
        boolean subtractCorrect = ResultChecker.assertEquals(5 ,subtractResult);
        if (subtractCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb" + c + " i " + d);
        }
        Calculator calculator3 = new Calculator();
        int e = 5;
        int toPowerResult = calculator3.toPower2(e);
        boolean toPowerCorrect = ResultChecker.assertEquals(25, toPowerResult);
        if (toPowerCorrect) {
            System.out.println("Metoda toPower2 działa poprawnie dla liczby " + e);
        } else {
            System.out.println("Metoda toPower2 nie działa poprawnie dla liczby " + e);
        }
    }
}