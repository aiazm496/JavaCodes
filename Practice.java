package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
        Book2 b1 = new Book2("happy", 2016, "abc");
        Book2 b2 = new Book2("happy", 2016, "abc");
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        b2 = b1;
        System.out.println(b2.hashCode());

        HashMap<String, String> map = new HashMap<>();

    }
}

