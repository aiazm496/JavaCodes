package com.company;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {  //toString better than getter.
        return "the card has a balance of " + this.balance + " euros.";
    }

    public void eatAffordably() {  //to make sure balance doesn't become -ve.
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }
    public void addMoney(double amount){
        if(amount<0){    //can't enter negative amount
            return;
        }
        if(this.balance+ amount >150.0){
            this.balance = 150.0;
            return;        //to end
        }
        this.balance+=amount;
    }
}
