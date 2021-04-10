package com.company;

public class Person4 {
    private String name;
    private int height;
    private int weight;

    public  Person4(String name){
        this.name = name;
        this.height = 0;
        this.weight = 0;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight(){
        return this.height;
    }
    public String getName(){
        return this.name;
    }


    public String toString(){
        return this.name + ",height: " + this.height + ",weight: " + this.weight;
    }
}
