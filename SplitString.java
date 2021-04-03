package com.company;

public class SplitString {
    public static void main(String[] args) {
        String s = "first second third fourth";
        String[] list = s.split(" ");//returns string array.
        for(String i : list){
            System.out.println(i);
        }
    }
}
