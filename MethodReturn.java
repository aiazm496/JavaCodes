package com.company;
//Write a method public static int numberUno() that returns the value 1.

public class MethodReturn {
    public static void main(String[] args) {
        int number = returnAlways1();
        System.out.println(number);
    }
    public static int returnAlways1(){
        return 1;
        //System.out.println("I always return 1"); never reached as return terminates function execution
    }
}
