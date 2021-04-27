package com.company;

public class SimpleDateWithEqualsOverride {
    private int day;
    private int month;
    private int year;

    public SimpleDateWithEqualsOverride(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override       //to override superclass method , we need to have same method name and parameters.
    public boolean equals(Object s) {
        if(this==s){
            return true;
        }
        if(!(s instanceof SimpleDateWithEqualsOverride)){
            return false;
        }
        SimpleDateWithEqualsOverride o = (SimpleDateWithEqualsOverride) s;
        if(this.day == o.day && this.month == o.month && this.year == o.year){
            return true;
        }
        return false;

    }


}

