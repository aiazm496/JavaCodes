package com.company;
import java.util.ArrayList;
//ArrayList is a reference type var like String,
//Integer,Double are also reference var.
//int,double are primitive var.
//Arraylist<Integer> convert all int to Integer reference type.
public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //ArrayList<Integer> list2 = new ArrayList<>();
        //ArrayList<Double> list3 = new ArrayList<>();
        list.add("First");
        list.add("Second");


        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
