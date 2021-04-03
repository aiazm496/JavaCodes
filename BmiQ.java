package com.company;

public class BmiQ {
    public static void main(String[] args) {
        Bmi b = new Bmi("Akash");
        b.setHeight(175);
        b.setWeight(72);
        System.out.println("BMI: " + b.bodyMassIndex());

        System.out.println(b);
    }
}
