package com.company;
import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Akash");
        list.add("is");
        list.add("my");
        list.add("name");

        for(String i : list){  // for (data type i : list)
            System.out.println(i);
        }

    }
}
