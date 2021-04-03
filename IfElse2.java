package com.company;

public class IfElse2 {
    public static void main(String[] args) {
        int number = 5;

        if(number >10) {
            System.out.println("No greater than 10");
        }else if (number >5 && number <=10){
            System.out.println("No greater than 5 but less than 10");
        }else{
            System.out.println("Number less than equal to 5");
        }
    }
}
