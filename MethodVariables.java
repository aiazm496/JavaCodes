package com.company;

public class MethodVariables {
    public static void main(String[] args) {
        int a = 2;
        incrementBy3(a);
        System.out.println("value of a in main method: " + a);
        //value of var a in main method isn't changed by method var a.
    }
    public static void incrementBy3(int a){
        a = a+3;
        System.out.println(a); //life method var is finished after method execution done.
    }
}
