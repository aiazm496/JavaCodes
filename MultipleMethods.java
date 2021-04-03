package com.company;

public class MultipleMethods {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        int a = 1;
        int b = 2;
        int sum = sum(a,b);
        System.out.println(sum);
    }
    public static int sum(int a, int b){
        return a+b;
    }

}
