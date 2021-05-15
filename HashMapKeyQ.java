package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapKeyQ {
    public static void main(String[] args) {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");
        printKeys(hashmap);
        System.out.println("-----");
        printKeysWhere(hashmap,"i");
        String s = "akash";
        System.out.println("---");
        printValuesOfKeyWhere(hashmap,".e");
    }

    public static void printKeys(HashMap<String,String> hashMap){
        for(String key : hashMap.keySet()){
            System.out.println(key);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashMap, String key){
        for(String s : hashMap.keySet()){
            if(s.contains(key)){
                System.out.println(s);
            }
        }
    }
    public static void printValuesOfKeyWhere(HashMap<String,String> hashMap, String key){
        for(String s : hashMap.keySet()){   //hashMapvalues method to iterate through values.
            if(s.contains(key)){
                System.out.println(hashMap.get(s));
            }
        }
    }
}
