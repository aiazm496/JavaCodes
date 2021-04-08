package com.company;
import java.util.Scanner;

public class CallingPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter your weight:");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter your height: ");
        double height = Double.parseDouble(scanner.nextLine());
        PersonRClass p = new PersonRClass(name,age,weight,height);
        System.out.println(p);
    }
}
