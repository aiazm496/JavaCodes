package com.company;
//swap index 0 and 1 values
public class ArrayQ {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 42;
        arr[1] = 13;
        arr[2] = 12;
        arr[3] = 7;
        arr[4] = 1;
        for(int i : arr){
            System.out.println(i);
        }
        //swapping
        int a  = arr[1];
        arr[1] = arr[0];
        arr[0] = a;
        for(int i : arr){
            System.out.println(i);
        }
    }
}
