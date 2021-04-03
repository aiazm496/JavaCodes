package com.company;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr = new int[3];  //String[] strings = new String[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;

        System.out.println("The first element is: " + arr[0]);
        System.out.println("The last element is: " + arr[arr.length-1]);
        //System.out.println(arr);
        for(int i : arr){
            System.out.println(i);
        }

    }

}
