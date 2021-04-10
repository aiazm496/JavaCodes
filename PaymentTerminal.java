package com.company;
//process both cash and card payments.

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal(){
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment){
        //affordabls meals cost 2.50euro
        //return change
        if(payment>=2.50){
            this.affordableMeals++;
            this.money+=2.50;
            return payment-2.50;
        }else{
            return payment;
        }
    }

    public double eatHeartily(double payment){
        //heartily meals cost 4.30euros
        if(payment>=4.30){
            this.money+=4.30;
            this.heartyMeals++;
            return payment-4.30;
        }else{
            return payment;
        }
    }

    //card payment money is not added to terminal money
    public boolean eatAffordably(PaymentCard2 p){
        //affordable meal is 2.5euros, if balance is available return true else false. decrease balance of card too.
        if(p.balance()>=2.50){
            this.affordableMeals++;
            p.setBalance(p.balance()-2.50);
            return true;
        }else{
            return false;
        }

    }
    public boolean eatHeartily(PaymentCard2 p){
        //affordable meal is 2.5euros, if balance is available return true else false.
        //decrease balance of card too.
        if(p.balance()>=4.30){
            this.heartyMeals++;
            p.setBalance(p.balance()-4.30);
            return true;
        }else{
            return false;
        }

    }
    //add money to payment card obj

    public void addMoneyToCard(PaymentCard2 p, double amount)
    {
        if(amount<0){
            return;
        }
        p.setBalance(p.balance()+amount);
    }
    public String toString(){
        return "Money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals + " and no of sold heartily meals: " + this.heartyMeals;
    }


}
