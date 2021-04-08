package com.company;

public class CallingRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20,10);
        System.out.println(r);
        System.out.println(r.surfaceArea());
        r.narrow();
        System.out.println(r.surfaceArea());
    }
}
