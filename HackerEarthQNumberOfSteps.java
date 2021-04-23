package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class HackerEarthQNumberOfSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        int steps = 0;
        ArrayList<Integer> arrI = new ArrayList<>();
        ArrayList<Integer> arr2I = new ArrayList<>();
        for(int i = 0; i < size; i++){
            arrI.add(Integer.parseInt(arr[i]));
            arr2I.add(Integer.parseInt(arr2[i]));
        }

        for(int j = 0; j < size ; j++){

        }
    }
}
