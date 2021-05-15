package com.company;

import java.util.HashMap;

public class TimeSightedHashMap {
    private HashMap<String,Integer> register;

    public TimeSightedHashMap(){
        this.register = new HashMap<>();
    }

    public void addSighting(String sighted){
        int timesSighted = this.register.getOrDefault(sighted,0);
        timesSighted++;
        this.register.put(sighted,timesSighted);
    }

    public int timesSighted(String sighted){
        return this.register.getOrDefault(sighted,0);
    }

}


