package com.company;
//just like class ReadingObjectsFromFile
//make a method which returns Array list containing Person2 objects
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class ReadingObjectsFromFileViaMethod {
    public static void main(String[] args) {
        ArrayList<Person2> list2 = returnRecordsFromFile("name2age.txt");
        for (Person2 p : list2){
            System.out.println(p);
        }
    }
    public static ArrayList<Person2> returnRecordsFromFile(String fileName){
        ArrayList<Person2> list = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts  = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                list.add(new Person2(name,age));
        }
            return list;
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return list;
        }
    }

}
