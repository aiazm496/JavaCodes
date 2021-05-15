package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapArrayList {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Pekka",new ArrayList<>()); //empty array list.
        phoneNumbers.get("Pekka").add("111-22");
        phoneNumbers.get("Pekka").add("222-33");
        System.out.println(phoneNumbers.get("Pekka"));
    }
}
