package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Book2HashMapQ {
    public static void main(String[] args){
        Book2 senseAndSensibility = new Book2("Sense and Sensibility", 1811, "...");
        Book2 prideAndPrejudice = new Book2("Pride and Prejudice", 1813, "....");

        ArrayList<Book2> list = new ArrayList<>();
        list.add(senseAndSensibility);
        list.add(prideAndPrejudice);

        System.out.println(get(list,"Sense and Sensibility"));
        HashMap<String,Book2> bookMap = new HashMap<>();
        bookMap.put(senseAndSensibility.getName(),senseAndSensibility);
        bookMap.put(prideAndPrejudice.getName(),prideAndPrejudice);
        System.out.println(bookMap.get("Sense and Sensibility"));  //get returns value of key, here it is book obj that is returned.

    }

    public static Book2 get(ArrayList<Book2> list, String name){
        for(Book2 b : list){
            if(b.getName().equals(name)){
                return b;
            }
        }
        return null;
    }
}
