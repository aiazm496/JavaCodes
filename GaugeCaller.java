package com.company;

public class GaugeCaller {
    public static void main(String[] args) {
        Gauge g = new Gauge();

        //System.out.println(g.getValue());

        while(!g.full()){
            System.out.println("Not full " + g.getValue());
            g.increase();
        }
        System.out.println(g.getValue());
    }
}
