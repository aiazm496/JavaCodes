package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Message {
    public static void main(String[] args) {

        System.out.println("hello" + " " + "world");

        System.out.println("Please enter your name below: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", How are you?" );


    }
}
