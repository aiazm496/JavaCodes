package com.company;

import java.util.ArrayList;
import java.util.HashMap;

//store one or more translation of each word
public class DictionaryHashMap {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryHashMap(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        //if word is not present as key
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        if(!(this.dictionary.containsKey(word))){
            return new ArrayList<>();
        }
        return this.dictionary.get(word);
    }

    public void remove(String word){
        if(this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        }else{
            System.out.println("word not found!");
        }
    }
}
