package com.company;

import java.util.HashMap;

public class PersonHashMapQ {
    public static void main(String[] args) {
        Person6 p = new Person6("akash",25);
        HashMap<String,Person6> personMap = new HashMap<>();
        personMap.put(p.getName(),p);
        System.out.println(personMap.get("akash").getAge());

    }
}
