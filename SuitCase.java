package com.company;

import java.util.ArrayList;

///add item obj to arraylist
public class SuitCase {
    private int maxWeight;
    private ArrayList<Item> list;

    public SuitCase(int maxWeight){
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    public int totalWeight(){
        if(this.list.isEmpty()){
            return 0;
        }
        int totalWeight = 0;
        for(Item i : this.list){
            totalWeight+=i.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item i){  //add items such that total weight of suitcase does not exceed maxWeight.
        if(i.getWeight() + this.totalWeight()>this.maxWeight){
            return;
        }
        this.list.add(i);
    }

    public int totalItems(){
        return this.list.size();
    }

    public void printItems(){
        for(Item i : this.list){
            System.out.println(i);
        }
    }
    public Item heaviestItem(){
        if(this.list.isEmpty()){
            return null;
        }
        Item heaviest = this.list.get(0);
        for(Item i : this.list){
            if(i.getWeight()>heaviest.getWeight()){
                heaviest = i;
                return heaviest;
            }
        }
        return heaviest;

    }

    @Override
    public String toString(){
        if(this.list.size()==0){
            return "0 items (0 kg)";
        }
        if(this.list.size()==1){
            return "1 item " + "(" + this.totalWeight() + " kg)";
        }
        return this.totalItems() + " items" + " (" + this.totalWeight() + " kg)";

    }


}
