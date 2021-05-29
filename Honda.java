package com.company;

public class Honda extends Bike{
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
        b.sound();
    }

    public void run(){
        System.out.println("Running fine!");
    }

    @Override
    public void sound(){
        System.out.println("less sound.");
    }

}
