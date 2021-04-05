package com.company;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(true){
        String s = scanner.nextLine();
        if(s.equalsIgnoreCase("end")){
            break;
        }
        System.out.println(s);
    }
}
}
