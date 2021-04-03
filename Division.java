package com.company;

public class Division {
    public static void main(String[] args) {
        System.out.println(3/2);
        double result = 3/2;   //1 as 3/2 = 1
        System.out.println(result);
        double a = 3.0/2;
        System.out.println(a);

        double b = (double) 3/2;  //3 is casted to double
        System.out.println(b);
        double c= 1.0 * 3/2;
        System.out.println(c);

    }
}
