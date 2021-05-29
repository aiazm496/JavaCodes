package com.company;

public class SuperClass {
    private String objectVariable;

    public SuperClass(){
        this("Example");
    }

    public SuperClass(String value){
        this.objectVariable = value;
    }

    public String toString(){
        return this.objectVariable;
    }
}
