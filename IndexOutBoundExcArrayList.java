package com.company;
import java.util.ArrayList;

public class IndexOutBoundExcArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        System.out.println(list.get(1));

    }

}
