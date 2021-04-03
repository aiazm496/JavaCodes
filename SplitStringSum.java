package com.company;
import java.util.Scanner;
//take input till empty string entered and print sum of ages after splitting string with comma.

public class SplitStringSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum  = 0;
        while (true){
            String s = scanner.nextLine();
            if(s.equals("")){
                break;
            }
            String[] arr = s.split(",");
            int age = Integer.parseInt(arr[1]);
            sum+=age;
        }
        System.out.println("Sum of age: " + sum);
    }
}
