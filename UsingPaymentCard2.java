package com.company;

public class UsingPaymentCard2 {
    public static void main(String[] args) {
        PaymentCard2 p = new PaymentCard2(50.0);
        System.out.println("Balance: " + p.balance());

        //add 50.0 rs more
        p.addMoney(50.0);
        System.out.println("Balance: " + p.balance());

        //taking out 50.0 for shopping
        boolean successfull = p.takeMoney(50.0);
        System.out.println("Withdraw succesfull: " + successfull);
        System.out.println("Balance: " + p.balance());
        //taking 100.0 for emergency
        successfull = p.takeMoney(100.0);
        System.out.println("Withdraw succesfull: " + successfull);
        System.out.println("Balance: " + p.balance());

    }
}
