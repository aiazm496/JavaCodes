package com.company;

import java.util.Scanner;

public class HackerEarthQMaxBorders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases > 0) {
            String[] arr = scanner.nextLine().split(" ");
            int rows = Integer.parseInt(arr[0]);
            int size = Integer.parseInt(arr[1]);
            int sCnt = 0;
            int m = 0;
            while(rows>0){
                String s = scanner.nextLine();
                for (int i = 0; i < size; i++) {
                    if (s.charAt(i) == '#') {
                        sCnt++;
                    }
                }
                m = Math.max(sCnt,m);
                sCnt = 0;
                rows--;
            }
            System.out.println(m);
            testCases--;
        }
    }
}