package com.company;
import java.util.Scanner;

public class LiteralConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        double avg = (a+b)/2;   // avg = 7/2 = 3 as 7 and 2 both int
        System.out.println(avg);
        double avgD = (1.0*a+b)/2;
        System.out.println(avgD);
        ;
    }

}
