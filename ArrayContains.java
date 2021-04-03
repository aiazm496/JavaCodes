package com.company;
import java.util.ArrayList;


public class ArrayContains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        list.add("how");
        list.add("are");
        list.add("you!");

        boolean isHiPresent  = list.contains("hi");
        if (isHiPresent){
            System.out.println("Hi present!.");
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);

        boolean a = list2.contains(2); // contains require object input.
        System.out.println(a);

    }
}
