package com.company;
import java.util.Scanner;


//comparing to strings. == not allowed, use .equals() as it is an object, for primitive data types you can use ==
public class BooleanOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if(s1.equals(s2)){
            System.out.println("Two strings are same!");
        }else{
            System.out.println("Two strings are diff.");
        }
    }
}
