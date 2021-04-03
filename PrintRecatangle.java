package com.company;

public class PrintRecatangle {
    public static void main(String[] args) {
        printRectangle(17,3);
    }
    public static void printRectangle(int a,int b){
        while(b>0){
            for(int i = 1; i<=a; i++){
                System.out.print("*");
            }
            System.out.println("*");
            b-=1;
        }
    }

}
