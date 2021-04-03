package com.company;
import java.util.Scanner;  //Scanner tool to take input from user

public class InputPrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating scanner tool

        System.out.println("Write a message: ");

        //reading the user input and assigning it to program memory
        //scanner.next returns string of input
        String message = scanner.nextLine();

        System.out.println(message); //printing the message given by user

    }
}
