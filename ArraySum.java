package com.company;
//print sum of array using method

public class ArraySum {
    public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};
    int sum = sum(arr);
    System.out.println("Sum: " + sum);
    }

    public static int sum(int[] a){
        int sum = 0;
        for (int i : a){
            sum+=i;
        }
        return sum;
    }
}
