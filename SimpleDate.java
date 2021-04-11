package com.company;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean before(SimpleDate s){
        // 2020-01-20 > 2020-01-22
        if(this.year< s.getYear()){
            return  true;
        }
        if(this.year > s.getYear()){
            return false;
        }
        //only come to this if statement, if year is for both same for both obj.
        if(this.month < s.getMonth()){
            return  true;
        }
        if(this.month> s.getMonth()){
            return  false;
        }
        if(this.day<s.getDay()){
            return true;
        }
        return  false;
    }


    public String toString(){
        return this.day + "." + this.month + "." + this.year;
    }
}
