package com.company;

public class Counter {
    private int value;

    public Counter(){
        this(0);
    }

    public Counter(int initialValue){
        this.value = initialValue;
    }

    public void increase(){
        this.value+=1;
    }
    public String toString(){
        return "value: " + this.value;
    }

    public Counter clone(){  //return type Counter
        Counter clone = new Counter(this.value);
        return clone;
    }

}
