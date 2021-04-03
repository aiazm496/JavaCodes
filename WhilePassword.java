package com.company;
import java.util.Scanner;

//write a program which asks for pass

public class WhilePassword {
    public static void main(String[] args) {
        String password = "12345678";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your password");
            String inputPassword = scanner.nextLine();

            if(inputPassword.equals(password)){      //password is case sensitive - use .equalsignorecase to removeit.
                System.out.println("Password is correct");
                break;
            }
            System.out.println("Incorrect Password!, Please try-again.");
            }

        }
    }

