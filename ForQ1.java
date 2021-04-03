package com.company;
import java.util.Scanner;


public class ForQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for(int a = 1; a<=number;a++){
            sum+=a;
        }
        System.out.println("The sum is : " + sum);
    }
}
