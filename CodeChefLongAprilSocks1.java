package com.company;
import java.util.Scanner;

public class CodeChefLongAprilSocks1 { //change to Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] socks = scanner.nextLine().split(" ");
        String A = socks[0];
        String B = socks[1];
        String C = socks[2];
        if (A.equals(B)) {
            System.out.println("YES");
        }else if(B.equals(C)){
            System.out.println("YES");
        }else if(A.equals(C)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}