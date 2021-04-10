package com.company;
//this classes object will have balance input by user,
//method to display balance, to add money , to deduct balance based on input amount
//return true if amount can be deducted otherwise false

public class PaymentCard2 {
    private double balance;

    public PaymentCard2(double balance){
        this.balance = balance;
    }
    public  double balance(){
        return this.balance;
    }
    public void addMoney(double amount){
        this.balance+=amount;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public boolean takeMoney(double amount){
        if(this.balance<amount){
            return false;
        }
        this.balance-=amount;
        return true;
    }

}
