package com.company;
import java.util.ArrayList;


public class ObjEqualityInLists {
    public static void main(String[] args) {
        ArrayList<Bird> list = new ArrayList<>();
        Bird b1 = new Bird("Red");
        list.add(b1);
        System.out.println(b1);
        System.out.println(list.contains(b1));
        b1 = new Bird("Red");
        System.out.println(b1);
        System.out.println(list.contains(b1));
        for(Bird b : list){
            System.out.println(b);
        }
        //when object Red created and was referred by b1. it was also added to
        //list
        //when this object is re-referenced outside, the reference
        //var inside list doesn't change the memory location of prev reference.
        //thus the object in list is not equal to same name object outside.

    }
}
