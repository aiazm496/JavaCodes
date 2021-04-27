package com.company;

import com.company.AmusementParkWithList;
import com.company.Person;
import com.company.Person5;

public class AmustmentPartWithListQ {
    public static void main(String[] args) {
        AmusementParkWithList a = new AmusementParkWithList("disney", 160);
        Person5 p1 = new Person5("akash",174);
        Person5 p2 = new Person5("ravi", 155);
        Person5 p3 = new Person5("divya", 180);
        System.out.println(a);
        System.out.println(a.isAllowedOn(p1));
        System.out.println(a.isAllowedOn(p2));
        System.out.println(a.isAllowedOn(p3));
        Person5 tallest = a.getTallest();
        System.out.println("Tallest: " + tallest.getName());


        System.out.println(a);
        a.clearRide();
        System.out.println(a);
        //System.out.println(a.getTallest().getName());  Null pointer exception since, a.getTallest() return null object.

    }
}
