package com.company;
import java.util.Scanner;

public class AverageFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double avgOf3Numbers = average(a,b,c);
        //System.out.println("The average is: " + average(a,b,c))
    }
    //value if a,b,c copied in method average(so names can be same)
    public static double average(int a, int b, int c){
        double result = a+b+c/3.0;
        return result;
    }

}
