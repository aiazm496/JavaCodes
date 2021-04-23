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

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void advance(){  //add 1 day.
        this.advance(1);
    }

    public void advance(int howManyDays){
        if((this.day + howManyDays) <= 30){
            this.day+=howManyDays;
        }else if ((this.day + howManyDays) > 30 && this.month!=12){
            this.day = howManyDays - (30-this.day);
            this.month++;
        }else{
            this.day = howManyDays - (30-this.day);
            this.month = 1;
            this.year++;
        }
    }
    //creating object from method so that original object doesn't change.
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day,this.month,this.year);

        if((newDate.getDay()) <= 30){
            newDate.setDay(newDate.getDay() + days);
            return newDate;
        }else if ((newDate.getDay() + days) > 30 && newDate.getYear()!=12){
            newDate.setDay(days - (30- newDate.getDay()));
            newDate.setMonth(newDate.getMonth()+1);
            return newDate;
        }else{
            newDate.setDay(days - (30- newDate.getDay()));
            newDate.setMonth(1);
            newDate.setYear(newDate.getYear()+1);
            return newDate;
        }

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
