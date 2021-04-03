package com.company;
import java.util.Scanner;

public class LoopQues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Give numbers:");
        int countNumbers = 0;
        int countEven = 0;
        int countOdd = 0;

        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number==-1){
                break;
            }
            System.out.println(number);
            sum += number;
            countNumbers+=1;
            if (number%2==0){
                countEven+=1;
            }
            else if(number%2!=0){
                countOdd+=1;
            }

        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countNumbers);
        System.out.println("Average: " + 1.0*sum/countNumbers);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);


    }
}
