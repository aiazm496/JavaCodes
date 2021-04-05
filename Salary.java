package com.company;
//creating a salary class to get what amount to pay to employee.
//per-day wage is
public class Salary {
    private int present;
    private int balance; //not used now.
    private String name;
    private int monthSalary;

    public Salary(String name, int monthlySalary){
        this.present = 0;
        this.balance = 0;
        this.name = name;
        this.monthSalary = monthlySalary;
    }

    public void setPresent(int daysPresent){ //setter for days employee was present in this month.
        this.present = daysPresent;
    }

    public double paySalary(){
        return (this.monthSalary/30.0)*this.present;
    }

    public String toString(){
        return "Credited salary " + "to " + this.name + " is: " + paySalary();
    }

}
