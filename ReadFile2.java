package com.company;
import java.util.Scanner;
import java.nio.file.Paths;
//it reads from root folder JavaFirstProgram

public class ReadFile2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(Paths.get("data.txt"))){ //same like os.path.join
            while(scanner.hasNextLine()){ //will stop if it is last line
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }
        catch (Exception e ){
            System.out.println("Error :" + e.getMessage());
        }
    }
}
