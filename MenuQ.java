package com.company;

public class MenuQ {
    public static void main(String[] args) {
        Menu m1 = new Menu();
        m1.addMeals("dosa");
        m1.addMeals("bhature");
        m1.addMeals("pizza");

        m1.printMeals();
        m1.clearMenu();
        m1.addMeals("Momos");
        m1.printMeals();
    }
}
