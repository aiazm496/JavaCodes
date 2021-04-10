package com.company;

public class HealthQ {
    public static void main(String[] args) {
        PersonOverloadingConstructor p1 = new PersonOverloadingConstructor("Akash",24, 175, 72);
        HealthStation h = new HealthStation();
        System.out.println("The weight of " + p1.getName() + " is " + h.weigh(p1));
        h.feed(p1);
        System.out.println("The weight of " + p1.getName() + " is " + h.weigh(p1));
        System.out.println("No of weighings: " + h.getWeighings());

    }
}


