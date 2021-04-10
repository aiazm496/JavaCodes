package com.company;

public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;

    public AmusementParkRide(String name, int lowestHeight){
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }

    public String toString(){
        return this.name + ", " + this.lowestHeight + ", visitors: " + this.visitors;
    }

    public boolean isAllowedToRide(Person4 p){
        if(p.getHeight()<this.lowestHeight){
            return false;
        }
        this.visitors++;
        return true;

    }
}
