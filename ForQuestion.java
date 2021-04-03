package com.company;
import java.util.Scanner;
/*Write a program that reads an integer from the user. Next, the program prints numbers
        from 0 to the number given by the user.
        You can assume that the user always gives a positive number. */

public class ForQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.valueOf(scanner.nextLine());
        int stop = Integer.valueOf(scanner.nextLine());

        for (int i = start; i <= stop; i++){
            System.out.println(i);
        }

    }
}
