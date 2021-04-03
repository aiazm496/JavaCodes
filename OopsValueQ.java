package com.company;

public class OopsValueQ {
    public static void main(String[] args) {
        DecreasingCounter dc = new DecreasingCounter(5);
        DecreasingCounter dc2 = new DecreasingCounter(0);

        dc.printValue();
        dc2.printValue();
        System.out.println(" ");

        dc.decrementValue();
        dc2.decrementValue();

        dc.printValue();
        dc2.printValue();
        System.out.println(" ");

        dc.resetValue();
        dc.printValue();
    }
}
