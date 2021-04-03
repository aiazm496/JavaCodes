package com.company;
import  java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        String s = "akash";
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(s + " " + a);
        System.out.println(s.charAt(0));
        System.out.println(s.length());

    }
}
