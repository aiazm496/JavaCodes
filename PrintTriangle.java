package com.company;

public class PrintTriangle {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printTriangle(int a){
       for (int i = 1; i<=a;i++){
           for(int j = 1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println("");
       }

    }
}
