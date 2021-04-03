package com.company;
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.valueOf(scanner.nextLine());

        if(year%100==0 && year%400==0){
            System.out.println("It is a leap year");
        }else if(year%100==0 && year%400!=0){
            System.out.println("not a lear year!");
        }else if(year%4==0){
            System.out.println("it is a leap year");
        }else{
            System.out.println("not a leap year!");
        }

    }
}
