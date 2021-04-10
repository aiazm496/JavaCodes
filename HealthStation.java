package com.company;

public class HealthStation {
    private int weighings;

    public HealthStation(){
        this.weighings = 0;
    }

    public int getWeighings() {
        return weighings;
    }

    public int weigh(PersonOverloadingConstructor o){
        this.weighings++;
        return o.getWeight();
    }
    public void feed(PersonOverloadingConstructor o){
        o.setWeight(o.getWeight()+1);
    }
}
