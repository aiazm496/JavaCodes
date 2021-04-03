package com.company;
import java.util.Scanner;
/*Define a two-parameter method smallest that returns the smaller of the two
        numbers passed to it as parameters.*/

public class MethodQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("The smaller of two numbers is: " + returnSmaller(a,b));
    }

    public static int returnSmaller(int a , int b){
        return Math.min(a,b);
    }

    }
