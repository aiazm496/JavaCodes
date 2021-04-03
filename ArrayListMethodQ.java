package com.company;
import java.util.ArrayList;

//write a method to calculate sum of array list.

public class ArrayListMethodQ {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        sum(list);
    }

    public static void sum(ArrayList<Integer> a){
        int sum = 0;
        for(int i: a){
            sum+=i;
        }
        System.out.println("Sum: " + sum);

    }
}
