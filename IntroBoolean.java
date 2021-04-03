package com.company;

public class IntroBoolean {
    public static void main(String[] args) {
        boolean isHappy = true;
        //boolean isHappy = 4>2;
        // java only boolean condition are considered
        //unlike python 0 isn't considered false
        //similarly non-zero int or  non-empty strings
        // are not considered as true.
        if (isHappy) {
            System.out.println("He is happy!");
        }else{
            System.out.println("he is unhappy!");
        }
    }
}
