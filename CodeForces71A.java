package com.company;

import java.util.Scanner;

public class CodeForces71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while(testCases>0){
            String s = scanner.nextLine();
            if(s.length()>10){
                System.out.print(s.charAt(0));
                System.out.print(s.length()-2);
                System.out.print(s.charAt(s.length()-1));
                System.out.println();
                testCases--;
                continue;
            }
            System.out.println(s);
            testCases--;
        }

    }
}
