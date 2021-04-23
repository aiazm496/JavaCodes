package com.company;

import java.util.Scanner;

public class CodeForces4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        check(i);
    }

    public static void check(int a){
        if(a==1 || a%2!=0 || a==2){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }


}
