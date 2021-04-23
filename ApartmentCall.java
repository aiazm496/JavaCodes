package com.company;

public class ApartmentCall {
    public static void main(String[] args) {

        Apartment a1 = new Apartment(4,200,500);
        Apartment a2 = new Apartment(5,240,400);

        System.out.println("a1 greater than a2: " + a1.largerThan(a2));
        System.out.println("a1 price minus a2's price: " + a1.priceDifference(a2));



    }
}
