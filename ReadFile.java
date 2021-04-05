package com.company;

import java.util.Scanner;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(Paths.get("file.txt"))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }




    }
}
