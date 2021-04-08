package com.company;

public class OverloadingConstructorAndMethod {
    private String name;
    private int age;

    public OverloadingConstructorAndMethod(String name){
        //this.name = name;
        //this.age = 0;
        this(name,0);
    }
    public OverloadingConstructorAndMethod(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void growOlder(){
        this.growOlder(1);
    }
    public void growOlder(int i){
        this.age+=i;
    }
}
