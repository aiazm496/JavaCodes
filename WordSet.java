package com.company;

import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> words;


    public WordSet(){
        this.words = new ArrayList<>();
    }

    public void addWords(String word){
        this.words.add(word);
    }

    public boolean contains(String word){
        return this.words.contains(word);
    }

    public void printWords(){
        if(this.words.isEmpty()){
            return;
        }
        for(String word : this.words){
            System.out.println(word);
        }
    }

}
