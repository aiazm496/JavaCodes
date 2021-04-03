package com.company;
import java.sql.JDBCType;
import java.util.Scanner;

public class Problem2Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());

        int sum = a+b;

        if(sum>100){
            System.out.println("High!");
        }else if(sum<0){
            System.out.println("too little");
        }else{
            System.out.println("ok");
        }

    }
}
