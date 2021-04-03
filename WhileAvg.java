package com.company;
import java.util.Scanner;
/*Write a program that asks the user for input until the user inputs 0. After this,
        the program prints the average of the numbers.
        The number zero does not need to be counted to the average.
        You may assume that the user inputs at least one number.*/

public class WhileAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumNumbers = 0;

        while(true){
            int number = Integer.valueOf(scanner.nextLine());

            if(number==0){
                break;
            }

            sumNumbers+=number;
        }
        System.out.println("the sum of numbers is: " + sumNumbers);
    }
}
