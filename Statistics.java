//calculate sum of odd and even seperately.
package com.company;

public class Statistics {
    private int count;  //declared instance var.
    private int sum;

    public Statistics(){ //initialized instance vars.
        this.count = 0;
        this.sum = 0;
    }
    public void addNumber(int number){
        this.count++;
        this.sum+=number;
    }
    public int getCount(){  //getter.
        return this.count;
    }
    public int sum(){
        return this.sum;
    }

    public double average(){
        return 1.0*this.sum()/this.getCount();
    }


}
