package com.company;
import java.util.ArrayList;

public class ArrayListReference {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        removeFirst(list);
        System.out.println(list);
    }
    public static void removeFirst(ArrayList<Integer> list){
        //in method with Object (here arraylist parameters)
        // the reference of parameter is received thus allowing making
        //changes in original list.
        if(list.size()==1){
            return;
        }
        list.remove(0);  //actually removes from list.
    }
}
