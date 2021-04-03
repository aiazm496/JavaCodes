package com.company;
import java.util.Scanner;

public class CodeChefLongAprilSSCRIPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        char toSearch = '*';
        while (testCases>0) {
            String[] para = scanner.nextLine().split(" ");
            int length = Integer.parseInt(para[0]);
            int repeat = Integer.parseInt(para[1]);
            String input = scanner.nextLine();
            int count = 0;
            int firstOccurenceIndex = -1;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == toSearch) {
                    firstOccurenceIndex = i;
                    count++;
                    break;
                }
            }
            if (firstOccurenceIndex == -1) {
                System.out.println("NO");
                testCases-=1;
                continue;
            }
            if (repeat == 1) {
                System.out.println("YES");
                testCases-=1;
                continue;
            }
            //System.out.println(firstOccurenceIndex);
            for (int j = firstOccurenceIndex+1; j < input.length(); j++) {
               /* if(input.charAt(j) != toSearch && j==firstOccurenceIndex+1){
                    //firstOccurenceIndex = -1;
                    continue;
                }*/
                if (input.charAt(j) == toSearch && j-firstOccurenceIndex == 1) {
                    count++;
                    firstOccurenceIndex=j;
                    continue;
                }
                if(input.charAt(j)!= toSearch){
                    firstOccurenceIndex = -1;
                    continue;
                }
                if (input.charAt(j) == toSearch && j-firstOccurenceIndex != 1) {
                    count = 1;
                    firstOccurenceIndex=j;
                    continue;
                }
                if(input.charAt(j) == toSearch ){
                    count++;
                }
            }

            if(count<repeat){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

            testCases-= 1;
            //System.out.println(testCases);
        }
    }
}








