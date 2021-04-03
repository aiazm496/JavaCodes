package com.company;

public class ReturnFromVoid {
    public static void main(String[] args) {
        division(3,0);
    }
    public static void division(int numerator, int denominator){
        if(denominator==0){
            System.out.println("denominator can't be zero");
            return;
        }
        System.out.println("The result is: " + 1.0*numerator/denominator);
}
}