package com.company;

public class CounterClone {
    public static void main(String[] args) {
        Counter c1 = new Counter(2);
        System.out.println(c1);
        Counter c2 = c1.clone();
        System.out.println(c2);
        System.out.println(c1.equals(c2)); //false
    }
}
