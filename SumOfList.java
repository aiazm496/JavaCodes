package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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
        int sum = 0;
        for (int i : list){  //using for each loop.
            sum+=i;
        }
        System.out.println("Sum: " + sum);
    }
}
