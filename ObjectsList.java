package com.company;
import java.util.ArrayList;

public class ObjectsList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jose Portilla");
        list.add("Chris Metal");
        list.add("Mitchell Johnson");

        //3 ways to print objects of Arraylist.
        for(String i : list){
            System.out.println(i);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        int i = 0;
        while(i<list.size()){
            System.out.println(list.get(i));
            i++;
        }

        //adding objects to list via Person class
        ArrayList<Person> list2 = new ArrayList<>();

        Person p1 = new Person("Akash");
        list2.add(p1);
        list2.add(new Person("Suresh"));

        for(Person j : list2){
            System.out.println(j);
        }

    }
}
