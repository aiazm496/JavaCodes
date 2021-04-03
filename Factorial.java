package com.company;
import java.util.Scanner;
//calculate factorial.

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int factorial = 1;

        while(number>=1){
            factorial*=number;
            number-=1;
        }
        System.out.println("Factorial: " + factorial);
    }
}
