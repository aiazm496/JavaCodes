package com.company;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of circle: ");
        //int radius = Integer.valueOf(scanner.nextLine());
        double radius = Double.valueOf(scanner.nextLine());
        //converting string input to integer.
        double pi = 3.14;
        double area  =  pi * radius * radius;

        System.out.println("The area of the circle is: " + area);


    }
}
