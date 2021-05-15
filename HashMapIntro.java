package com.company;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String,String> postalCodes = new HashMap<>();
        postalCodes.put("202001","Aligarh");
        postalCodes.put("202002","Hathras");
        postalCodes.put("202003","Meerut");

        System.out.println(postalCodes.get("202001"));
        System.out.println(postalCodes.get("X")); //returns null

        postalCodes.put("202001","KOL");
        System.out.println(postalCodes.get("202001"));


    }


}
