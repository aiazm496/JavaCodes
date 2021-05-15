package com.company;

public class LibraryQ {
    public static void main(String[] args) {
        Book2 b1 = new Book2("immortals",2016,"shiva");
        Book2 b2 = new Book2("ikigai",2018,"japan");
        Library l = new Library();
        l.addBook(b1);
        l.addBook(b2);
        System.out.println(l.getBook("immortals"));

    }
}
