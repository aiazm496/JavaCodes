package com.company;

public class Book {
    private String title;
    private int pages;
    private int pubYear;

    public Book(String name, int page, int year){
        this.title = name;
        this.pages = page;
        this.pubYear = year;
    }

    public String toString(){
        return this.title + "," + this.pages + "," + this.pubYear;
    }

    public String getTitle(){
        return this.title;
    }

}
