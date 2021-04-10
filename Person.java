package com.company;

public class Person {
    private String name;  //object attributes or instance var.
    private int age;   //private var are hidden in object.
    //can be accessed using getters.

    public Person(String initialName){
        this.name = initialName;
        this.age = 0;
    }

    public void printPerson(){ //if declared static then it cant use instance variables.
        System.out.println(this.name +",age " + this.age + " years." );
    }
    public void growOlder(){
        if(this.age<30){
        this.age = this.age+1;
    }

    }
    public int returnAge(){    //getter
        return this.age;
    }
    public String getName(){ //getter
        return this.name;
    }


    public String toString(){
        return this.name +",age " + this.age + " years.";
    }

    public boolean isLegalAge(){
        if (this.age >18){
            return true;
        }
        return false;
        }
    }

