package com.company;
import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(15);
        list.add(20);

        list.remove(2); //remove index 2 element
        list.remove(Integer.valueOf(15)); //Integer.valueOf returns Integer object.

        for(int i : list){
            System.out.println(i);
        }
    }
}
