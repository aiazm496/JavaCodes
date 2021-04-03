package com.company;


public class TypeConversion {
    public static void main(String[] args) {
        //Auto casting
        int a =2;
        double b = a;
        System.out.println(b);
        char c = 'A';
        int d = c;  //asci 65
        System.out.println(d);
        //narrow casting - manual
        double e = 2.0;
        int f = (int)e;
        System.out.println(f);
        int g = 65;
        char h = (char)g;
        System.out.println(h);
        int z = 'A' + 'B';
        System.out.println(z);
    }
}
