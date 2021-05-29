package com.company;

public class Circle extends Shape{

    public static void main(String[] args) {
        Shape c1 = new Circle();
        c1.draw();
        c1.sound();
    }

    public void draw(){
        System.out.println("drawing circle.");
    }

    @Override
    public void sound(){
        System.out.println("hmm");
    }
}
