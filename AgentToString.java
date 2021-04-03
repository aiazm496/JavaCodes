package com.company;

public class AgentToString {
    private String name;
    private int age;

    public AgentToString(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){   //toString is called by sout to print object
        return this.name + ", " +  this.age;
    }

}
