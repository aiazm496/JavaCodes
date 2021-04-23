package com.company;

import java.util.ArrayList;

public class AmusementParkWithList {
    private String name;
    private int minHeight;
    private int visitors;
    private ArrayList<Person5> persons;

    public AmusementParkWithList(String name,int minHeight){
        this.name = name;
        this.minHeight = minHeight;
        this.persons = new ArrayList<>();
    }

    public boolean isAllowedOn(Person5 p){
        if(p.getHeight()<this.minHeight){
            return false;
        }
        this.visitors++;
        this.persons.add(p);
        return true;

    }

    //clearing ride

    public void clearRide(){
        this.persons.clear();
    }

    //calculating average height of people on ride

    public double averageHeightOfPeopleOnRide(){
        if(this.persons.isEmpty()){
            return -1;
        }

        int sumHeights = 0;
        int cntPeople = this.persons.size();
        for(Person5 p : this.persons){
            sumHeights+=p.getHeight();
        }
        return 1.0*sumHeights/cntPeople;
    }

    //get tallest rider name.

    public Person5 getTallest(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person5 firstPerson = this.persons.get(0);
        for(Person5 p : this.persons){
            if(p.getHeight()>firstPerson.getHeight()){
                return p;
            }
        }
        return firstPerson;
    }

    @Override
    public String toString(){

        if(this.persons.isEmpty()){        //if no one is on ride, output that.
            System.out.println("no one is on ride.");
            return this.name + ",min height required: " + this.minHeight + ",visitors: " +
                    this.visitors;
        }

        String onRide = "";       //adding all person string name to this empty string.
        for(Person5 p : this.persons){
            onRide = onRide +  p.getName() + "\n";
        }
        return this.name + ",min height required: " + this.minHeight + ",visitors: " +
                this.visitors + "\n" +  "Riding: " + "\n" + onRide + this.averageHeightOfPeopleOnRide();
    }
}
