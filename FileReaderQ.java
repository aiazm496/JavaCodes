package com.company;
//ask user for file
//ask for number range
//print count of numbers in range
//file numbers.txt contains no from 1 to 20.
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class FileReaderQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        int lowerBound = Integer.parseInt(scanner.nextLine());
        int upperBound = Integer.parseInt(scanner.nextLine());
        int count = 0;
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                int row = Integer.parseInt(fileScanner.nextLine());
                if (row >= lowerBound && row <=upperBound){
                    count++;
                }
            }
        }catch (Exception e ){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: " + count);
    }
}
