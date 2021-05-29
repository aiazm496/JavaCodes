package com.company;

import oops.practice.questions.TacoBox;

public class TacosBox implements Tacos{

    public static void main(String[] args) {
        Tacos t = new TacosBox();
        t.eat();
        System.out.println(t.tacosRemaining());
    }

    private int tacos;

    public TacosBox(){
        this.tacos = 3;
    }

    public void eat(){
        this.tacos--;
    }

    public int tacosRemaining(){
        return this.tacos;
    }


}
