package com.company;

public class ChangingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        changeArray(arr);
        for(int i : arr){
            System.out.println(i);
        }
//since array is also a reference type var(object), thus it can be changed via methods.
    }
    public static void changeArray(int[] a){
        a[0] = 10;
        System.out.println("Changed the first element to 10");
    }
}
