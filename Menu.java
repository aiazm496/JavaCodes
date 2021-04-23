package com.company;

import java.util.ArrayList;

/*
The menu object has an ArrayList as an instance variable to store the names of the dishes on the menu.
The menu should provide the following methods:
public void addMeal(String meal) adds a meal to the menu. If the meal is already on the list, it should not be added again.
public void printMeals() prints the meals.
public void clearMenu() clears the menu.
*/
public class Menu {
    private ArrayList<String> meals;

    public Menu(){
        this.meals = new ArrayList<>();
    }

    public void addMeals(String meal){
        this.meals.add(meal);
    }

    public void clearMenu(){
        this.meals.clear();
    }

    public void printMeals(){
        for(String m : this.meals){
            System.out.println(m);
        }
    }





}
