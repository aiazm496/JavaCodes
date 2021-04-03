package com.company;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double interestRate){
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
    public void waitOneYear(){
        this.balance = this.interestRate*this.balance;
    }

}
