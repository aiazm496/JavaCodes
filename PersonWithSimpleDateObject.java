package com.company;
//we will create person class
//with an instance variable as SimpleDate object.

public class PersonWithSimpleDateObject {
    private String name;
    private SimpleDate birthday; //object

    //constructor with Simple date object as input para
    public PersonWithSimpleDateObject(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }
    //constructor with inputs to create Simple Date object
    public PersonWithSimpleDateObject(String name, int day, int month, int year){
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }
    //person class should have all methods of object birthday(of StayDate) handy.
    public boolean olderThan(PersonWithSimpleDateObject p){
        if(this.birthday.before(p.getBirthday())){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.name + ",born on " + this.birthday;

    }
}
