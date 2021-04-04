package com.company;

public class Payment {
    public static void main(String[] args) {
        PaymentCard p = new PaymentCard(5);
        System.out.println(p);  // auto calls p.toString()

        p.eatAffordably();
        System.out.println(p); //2.4 euros

        p.eatHeartily(); //will not do anything else balance will become
        //3.4 and subtracting 4.6 would result in -ve balance.
        System.out.println(p); //2.4 euros

        PaymentCard p2 = new PaymentCard(149);
        p2.addMoney(5);

        System.out.println(p2);  //it should be 150 as max limit is already set.

        p2.addMoney(-2);
        System.out.println(p2); //no change in balance.
    }

}
