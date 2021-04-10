package com.company;

public class PersonOverloadingConstructor {
    private  String name;
    private int age;
    private int weight;
    private int height;

    public PersonOverloadingConstructor(String name){
        this(name,0,0,0);
    }
    public PersonOverloadingConstructor(String name, int age,  int height,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public  int getWeight(){
        return this.weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double bodyMassIndex(){
        double heightInM = this.height/100.0;
        return this.weight/heightInM*heightInM;
    }

    public  String toString(){
        return this.name + " age, " + this.age + " yrs";
    }

}
