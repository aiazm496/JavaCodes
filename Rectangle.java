package com.company;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public void widen(){
        this.width++;
    }
    public void narrow(){
        if(this.width>0){
            this.width--;
        }
    }
    public int surfaceArea(){
        return this.width*this.length;
    }
    public String toString(){
        return "(" + this.width + "," + this.length + ")";
    }
}
