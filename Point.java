package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int manhattanDistanceFromOrigin(){
        return Math.abs(this.x) + Math.abs(this.y);
    }

    public String location(){
        return this.x + "," + this.y;
    }

    @Override
    public String toString(){
        return "(" + this.location() + ")" + "distance: " + this.manhattanDistanceFromOrigin();
    }


}