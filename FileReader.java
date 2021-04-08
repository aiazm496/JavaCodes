package com.company;
//user input file , add to array list and print
//search for a string in file.
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class FileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        try(Scanner scanner  = new Scanner(Paths.get(filename))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                list.add(row);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        for(String i : list){
            System.out.println(i);
        }
        String toSearch = sc.nextLine();
        if(list.contains(toSearch)){
            System.out.println("The string is in list!");
        }else{
            System.out.println("The string is not on list");
        }

    }

}
