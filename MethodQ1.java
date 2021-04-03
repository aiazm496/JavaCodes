package com.company;
/*Expand the previous program so that the main
        program asks the user for the number of times the phrase will be printed
        (i.e. how many times the method will be called).*/
import java.util.Scanner;

public class MethodQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timesMethodToCall = Integer.parseInt(scanner.nextLine());
        while(timesMethodToCall>0){
            printText();
            timesMethodToCall-=1;
        }
    }
    public static void printText(){
        System.out.println("Hello World!");
    }

}
