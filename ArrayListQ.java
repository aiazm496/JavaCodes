package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQ {
    public static void main(String[] args) {
        ArrayList<String>  list  = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if(s.equals("")) {
                System.out.println(list.get(2));
                break;
            }
            list.add(s);
        }
        }
    }

