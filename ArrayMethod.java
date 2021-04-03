package com.company;

import java.util.ArrayList;

public class ArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(20);
        print(list);
    }

    public static void print(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
