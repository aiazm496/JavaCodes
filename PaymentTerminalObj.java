package com.company;
//look how concise the below code is using Java OOP.

public class PaymentTerminalObj {
    public static void main(String[] args) {
        PaymentTerminal p  = new PaymentTerminal();
        //cash payments
        double change = p.eatAffordably(10);
        System.out.println("remaining change: " + change);
        change = p.eatAffordably(5);
        System.out.println("remaining change: " + change);
        change = p.eatHeartily(4.3);
        System.out.println("remaining change: " + change);
        System.out.println(p);

        //card payments
        PaymentCard2 pc  = new PaymentCard2(100.0);
        boolean cardTrxSuccessfull = p.eatAffordably(pc);
        System.out.println("Card trx successfull: " + cardTrxSuccessfull);
        System.out.println(pc.balance());
        p.addMoneyToCard(pc,15.0);
        System.out.println(pc.balance());

    }
}
