package com.company;
import java.util.Scanner;

public class CodeChefLuckyFr {         //change the class name to Main for codechef
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while(testCases>0){
            String number = scanner.nextLine();
            int count = 0;
            for(int i = 0; i<number.length();i++){
                if (number.charAt(i)=='4'){
                    count++;
                }
            }
            System.out.println(count);
            testCases-=1;
        }
    }
}
