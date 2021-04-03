package com.company;
import java.util.Scanner;

public class Calculatior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter first number: ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.print("please enter second number: ");
        int b  = Integer.valueOf(scanner.nextLine());

        //in java string contanetion, the int/double will promote
        //tostring type ,so "" + a + b wil not add a and b, use().
        System.out.println("the sum of two nos is " + (a+b));
        System.out.println("difference is: " + (a-b));
        System.out.println("product is : " + (a*b));
        System.out.println("division is " + (1.0*a)/b);

    }
}
