package com.company;

public class MainProgram {
    public static void main(String[] args) {
        Debt debt = new Debt(120000.0, 1.01);
        debt.printBalance();

        debt.waitOneYear();
        debt.printBalance();

        int years = 0;
        while (years<20){
            debt.waitOneYear();
            years++;
        }
        debt.printBalance();
    }
}
