package com.company;
import java.util.Scanner;
import java.util.ArrayList;

//take average of inputs
public class AverageArrayList  {
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
        int size = list.size();
        int sum = 0;
        for (int i : list){
            sum+=i;
        }
        double average = 1.0*sum/size;
        System.out.println("Average: " + average);

    }

}
