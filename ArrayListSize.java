package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String s = scanner.nextLine();
            if(s.equals("")){
                break;
            }
            list.add(s);
        }
        System.out.println("In total: " + list.size());
    }
}
