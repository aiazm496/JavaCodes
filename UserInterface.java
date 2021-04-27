package com.company;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface(Scanner scanner, WordSet wordSet){
        this.scanner = scanner;
        this.wordSet = wordSet;
    }

    public void start() {
        while (true) {
            String word = this.scanner.nextLine();
            if (this.wordSet.contains(word)) {
                break;
            }
            this.wordSet.addWords(word);
        }
    }
    public void printWords(){
        this.wordSet.printWords();
    }

}
