package com.company;

public class Book2 {
    private String name;
    private int year;
    private String content;

    public Book2(String name, int year, String content) {
        this.name = name;
        this.year = year;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", content='" + content + '\'' +
                '}';
    }


}
