package com.company;
//read a file 'song.txt' and add lines to Arraylist
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFile3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get("song.txt"))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                list.add(row);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Total lines: " + list.size());

    }

}
