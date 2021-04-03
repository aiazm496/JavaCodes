package com.company;

public class PrintStarQ1 {
    public static void main(String[] args) {
        printStar(3);
        printStar(5);
        printStar(7);

    }
    public static void printStar(int a){
        while(a>0){
            System.out.print("*");
            a-=1;
        }
        System.out.println("");
    }

}
