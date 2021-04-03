package com.company;
import java.util.Scanner;

public class WhileLoopCountInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNegative = 0;

        while(true){

            int number = Integer.valueOf(scanner.nextLine());

            if(number<0){
                countNegative+=1;
                continue;
            }
            else if(number==0){
                break;
            }
            else{
                System.out.println("Enter negative number!");
            }

        }
        System.out.println("The total number of negative numbers are : " + countNegative);
    }
}
