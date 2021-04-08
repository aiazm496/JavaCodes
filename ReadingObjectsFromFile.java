package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
//reading csv file

public class ReadingObjectsFromFile {
    public static void main(String[] args) {
        ArrayList<Person2> list  = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get("nameage.txt"))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts  = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                list.add(new Person2(name,age));
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        for(Person2 p : list){
            System.out.println(p);
        }
    }

}
