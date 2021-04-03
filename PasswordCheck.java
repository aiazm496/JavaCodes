package com.company;
import java.util.Scanner;


public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        checkPassword(password);
    }
    public static void checkPassword(String s){
        if(s.equals("abc@123")){
            System.out.println("Password matched!");
        }
        else{
            System.out.println("Wrong password entered!");
        }
    }
}
