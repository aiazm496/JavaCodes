package com.company;
//take user input of Person class and add it to object.//stop when empty string is entered.
import java.util.Scanner;
import java.util.ArrayList;


public class AddingObjectToArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();
        while(true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            list.add(new Person(name));
        }

        System.out.println("total persons: " + list.size());
        System.out.println("Persons: ");

        for(Person i : list){
            System.out.println(i);
        }

    }
}
