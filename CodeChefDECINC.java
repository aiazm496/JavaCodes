package com.company;
import java.util.Scanner;

public class CodeChefDECINC { //change to Main for codechef.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if(number%4==0){
            System.out.println(number+1);
        }else{
            System.out.println(number-1);
        }
    }
}
