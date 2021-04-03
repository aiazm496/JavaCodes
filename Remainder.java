package com.company;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());

        if(a%b==0){
            System.out.println("a is divisible by b");
        }else{
            System.out.println("a is not divisible by b");
        }

    }
}
