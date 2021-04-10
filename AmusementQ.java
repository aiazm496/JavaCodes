package com.company;
//check if for a amusement park, of many person
//if a person is eligible to enter or not.
//what are the no of eligible visitors


public class AmusementQ {
    public static void main(String[] args) {
        AmusementParkRide a1 = new AmusementParkRide("Kinderland",140);

        Person4  p1 = new Person4("Akash");
        p1.setHeight(175);

        if(a1.isAllowedToRide(p1)){
            System.out.println(p1.getName() + " is allowed to ride.");
        }else{
            System.out.println(p1.getName() + " is not allowed to ride.");
        }
        System.out.println(a1);
    }
}
