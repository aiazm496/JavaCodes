package com.company;

import java.util.HashMap;
import java.util.Locale;

public class Library {
    private HashMap<String,Book2> bookMap;

    public Library(){
        this.bookMap = new HashMap<>();
    }

    public String sanitizeString(String s){  //class method.
        if(s==null){
            s = "";
            return s;
        }
        s = s.toLowerCase(Locale.ROOT);
        s = s.trim();
        return s;
    }


    public void addBook(Book2 b){
        String name  = sanitizeString(b.getName());

        if(this.bookMap.containsKey(name)){
            System.out.println("Book is already in library!");
        }else{
            this.bookMap.put(name,b);
        }
    }

    public Book2 getBook(String title){
        title = sanitizeString(title);
        return this.bookMap.get(title);
    }
    public void removeBook(String title){
        title = sanitizeString(title);
        if(this.bookMap.containsKey(title)){
            this.bookMap.remove(title);
        }else{
            System.out.println("book not found!.");
        }
    }

}
