package com.company;
import java.util.Scanner;
import java.util.ArrayList;


public class AddingObjectsToArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person2> list2 = new ArrayList<>();

        while(true){
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            int i = Integer.parseInt(scanner.nextLine());
            list2.add(new Person2(s,i));
        }

        for(Person2 j : list2){
            if(j.getAge()>10){
                System.out.println(j);
            }
        }
    }
}
