package com.company;

import java.util.*;

public class StreamQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();


        while (true){
            String word = scanner.nextLine();
            if(word.equals("end")){
                break;
            }

            list.add(word);
        }


        double average = list.stream().mapToInt(s->Integer.parseInt(s)).average().getAsDouble();

        System.out.println("Average: "  + average);

        long numbersDivisibleByThree = list.stream().mapToInt(s->Integer.parseInt(s)).filter(number->number%3==0).count();
        System.out.println("Numbers divisible by 3: " + numbersDivisibleByThree);
    }
}
