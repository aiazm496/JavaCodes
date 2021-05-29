package com.company;

public class ColorPoint extends Point{
    private String color;

    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color  = color;
    }

    @Override
    public String toString(){
        return "(" + super.location() + ")" + " distance " + super.manhattanDistanceFromOrigin() + " color " + this.color;
    }

}
