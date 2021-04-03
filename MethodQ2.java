package com.company;
/*Create the following method in the exercise template: public static void printFromNumberToOne(int number).
        It should print the numbers from the number passed as a parameter down to one.
        Two examples of the method's usage are given below.*/

public class MethodQ2 {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number){
        while (number>0){
            System.out.println(number);
            number-=1;
        }
    }
}

