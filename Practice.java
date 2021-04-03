package com.company;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);

        for(int i : list){
            System.out.println(i);
        }
        removeFirst(list);
        for(int i : list){
            System.out.println(i);
        }
    }
    public static void removeFirst(ArrayList<Integer> list){
        list.remove(0);

    }
}
