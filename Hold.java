package com.company;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<SuitCase> list;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    public int totalWeight() {
        if (this.list.isEmpty()) {
            return 0;
        }
        int totalWt = 0;
        for (SuitCase s : this.list) {
            totalWt += s.totalWeight();
        }
        return totalWt;
    }

    public void addSuitcase(SuitCase s) {
        if (s.totalWeight() + this.totalWeight() > this.maxWeight) {
            return;
        }
        this.list.add(s);
    }

    @Override
    public String toString() {
        if (this.list.isEmpty()) {
            return "no suitcases found.";
        }
        return this.list.size() + " suitcases " + "(" + this.totalWeight() + "kg)";

    }
}



