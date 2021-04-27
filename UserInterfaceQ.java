package com.company;

import java.util.Scanner;

public class UserInterfaceQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet wordSet = new WordSet();

        UserInterface u = new UserInterface(scanner,wordSet);
        u.start();

        u.printWords();
    }
}
