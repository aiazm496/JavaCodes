package com.company;

public class Cube {
    private int edgeLength;

    public Cube(int edge){
        this.edgeLength = edge;
    }

    public int volume(){
        return this.edgeLength*this.edgeLength*this.edgeLength;
    }

    public String toString(){
        return "The length of edge is " + this.edgeLength + " and" + " the volume is " + this.volume();
    }
}
