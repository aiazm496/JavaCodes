//from user input print greatest number
package com.company;
import javax.swing.plaf.synth.SynthStyle;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int b = 0;
        while (true) {
            int a = Integer.parseInt(scanner.nextLine());
            if(a== -1){
                break;
            }
            list.add(a);
            b = Math.max(a,b);
        }
        System.out.println("The greatest number: " + b);

    }
}
