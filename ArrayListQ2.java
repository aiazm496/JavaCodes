package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i==-1){
                break;
            }
            list.add(i);
        }
        for (int a = 0; a<list.size();a++){
            System.out.println(list.get(a));
        }

    }
}
