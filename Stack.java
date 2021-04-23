package com.company;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;

    public Stack(){
        this.list = new ArrayList<>();
    }

    public void addValue(String value){
        this.list.add(value);
    }

    public boolean isEmpty(){
        if(this.list.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<String> values(){
        return this.list;
    }

    public String take(){
        return this.list.remove(this.list.size()-1);  //returns last element
    }

}
