package com.company;

public class Bmi {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Bmi(String name){
        this.name = name;
        this.age  = 0;
        this.height = 0;
        this.weight = 0;
    }
    //setting obj instances with method para
    //these methods are called setters.
    public void setHeight(int height){
        this.height = height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public double bodyMassIndex(){
        double heightInMetres = this.height/100.0;
        return this.weight/(heightInMetres*heightInMetres);
    }

    public String toString(){
        return this.name + "is " + this.age + " old, " + "BMI is "
                + this.bodyMassIndex();
    }

}
