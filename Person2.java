package com.company;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public String toString(){
        return this.name + ", age: " + this.age;
    }

}
