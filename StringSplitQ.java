package com.company;
import java.util.Scanner;

public class StringSplitQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] list = s.split(",");
        String name = list[0];
        String age = list[1];
        System.out.println("Name: " + name + "," + " age: " + age);
    }
}
