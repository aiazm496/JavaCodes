package com.company;
//create a class with methods to decrement value by 1. should not decrement value to be negative
//also add

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue){
        this.value = initialValue;
    }
    public void printValue(){
        System.out.println(this.value);
    }
    public void resetValue(){
        this.value = 0;
    }
    public void decrementValue(){
        if(this.value<=0){
            return;
        }
        this.value = this.value-1;
    }

}

