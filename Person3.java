package com.company;

public class Person3 {
    private String name;
    private int birthYear;

    public Person3(String name){
        this.name = name;
        this.birthYear = 1970;
    }

    public int getBirthYear(){
        return this.birthYear;
    }
    public void setBirthYear(int year){
        this.birthYear = year;
    }
    public  String toString(){
        return this.name + "(" + this.birthYear + ")";
    }

}
