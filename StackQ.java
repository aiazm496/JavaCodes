package com.company;

public class StackQ {
    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.addValue("value");
        System.out.println(s.values());
        System.out.println(s.isEmpty());
        s.addValue("siezed");
        String lastElement= s.take();
        System.out.println(lastElement);
        System.out.println(s.values());


    }
}
