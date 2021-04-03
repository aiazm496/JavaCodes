package com.company;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("First number is: " + first);
        System.out.println("Second number is: " + second);

        int sum = first + second;

        System.out.println("The sum of two numbers is: " + sum);
        System.out.println("Four " + 2);  // 2 is converted to string and then combined.
        System.out.println("Four " + 2 + 2);   // Four 22


    }
}
