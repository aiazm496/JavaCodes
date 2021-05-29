package com.company;

public class SubClass extends  SuperClass {
    public SubClass(){
        super("Subclass");
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
