package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerEarthQItsMagic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length  = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< arr.length ; i++){
            list.add(Integer.parseInt(arr[i]));
        }
        int sum = 0;
        int minimum = 0;
        int m = 0;
        int cnt = 0;

        for(int j = 0 ; j < list.size(); j++){
            for(int k = 0; k!=j && k < list.size(); k++){
                sum+=list.get(k);
            }
            if(sum%7==0 && cnt==0 ){
                m = list.get(j);
                minimum = j;
                cnt++;
            }
            if(sum%7==0 && cnt!=0){
                if(list.get(j)<m){
                    minimum = j;
                }
            }
        }
        System.out.println(minimum);
    }

}
