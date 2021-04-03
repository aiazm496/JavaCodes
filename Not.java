package com.company;
import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.valueOf(scanner.nextLine());
        if(!(age==0)){
            System.out.println("ok");
        }else{
            System.out.println("Impossible");
        }
    }
}
