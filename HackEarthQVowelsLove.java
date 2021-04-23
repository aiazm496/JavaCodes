package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class HackEarthQVowelsLove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        ArrayList<Character> list = new ArrayList<>();
        while(testCases>0){
            String word = scanner.nextLine();
            word = word.toLowerCase();
            for(int i = 0 ; i < word.length(); i++){
                list.add(word.charAt(i));
            }
            if (list.contains('a')&& list.contains('e') && list.contains('i')
               && list.contains('o') && list.contains('u')) {
                System.out.println("lovely string");
            }else {
                System.out.println("ugly string");
            }
            list.clear();
            testCases--;
        }
    }

}
