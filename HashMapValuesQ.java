package com.company;

import java.util.HashMap;

public class HashMapValuesQ {
    public static void main(String[] args) {
        HashMap<String,Book2> hashMap = new HashMap<>();
        hashMap.put("sense", new Book2("lol",2015,"ga"));
        hashMap.put("vata", new Book2("lolu",2011,"gbca"));
        printValues(hashMap);
        System.out.println("-----");
        printValueIfNameContains(hashMap,"lolu");
    }

    public static void printValues(HashMap<String,Book2> hashMap){
        for(Book2 b : hashMap.values()){
            System.out.println(b);
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book2> hashMap,String s){
        for(Book2 b : hashMap.values()){
            if(b.getName().contains(s)){
                System.out.println(b);
            }
        }
    }
}
