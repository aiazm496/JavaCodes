package com.company;

import java.util.Scanner;

public class CodeForces231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        int solved = 0;
        while (testCases>0){
            String[] arr = scanner.nextLine().split(" ");
            int sum = 0;
            for(int i = 0; i< arr.length; i++){
                sum+=Integer.parseInt(arr[i]);
            }
            if(sum>=2) {
                solved++;
            }
            testCases--;
        }
        System.out.println(solved);

    }
}
