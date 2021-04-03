package com.company;
import java.util.Scanner;

public class GiftProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giftAmount = Integer.valueOf(scanner.nextLine());

        if (giftAmount == 5000) {
            System.out.println("Tax: " + 100);
        } else if (giftAmount > 5000 && giftAmount < 25000) {
            System.out.println("Tax: " + (100 + 0.08 * (giftAmount - 5000)));
        } else if (giftAmount == 25000) {
            System.out.println("Tax: " + 1700);
        } else if (giftAmount > 25000 && giftAmount < 55000) {
            System.out.println("Tax: " + (1700 + 0.1 * (giftAmount - 25000)));
        } else if (giftAmount == 55000) {
            System.out.println("Tax: " + 4700);
        } else if (giftAmount > 55000 && giftAmount < 200000) {
            System.out.println("Tax: " + (4700 + 0.12 * (giftAmount - 55000)));
        } else if (giftAmount == 200000) {
            System.out.println("Tax: " + 22100);
        } else if (giftAmount > 200000 && giftAmount < 1000000) {
            System.out.println("Tax: " + (22100 + 0.15 * (giftAmount - 200000)));
        } else if (giftAmount == 1000000) {
            System.out.println("Tax is: " + 142100);
        } else if (giftAmount > 1000000) {
            System.out.println("Tax: " + (142100 + 0.17 * (giftAmount - 1000000)));
        }else{
            System.out.println("No tax!");
        }
    }
    }

