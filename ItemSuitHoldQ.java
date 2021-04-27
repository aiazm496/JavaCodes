package com.company;

import java.util.ArrayList;

public class ItemSuitHoldQ {
    public static void main(String[] args) {
        Item i = new Item("motorbike",200);
        Item i2 = new Item("Wardrobe",50);
        Item i3 = new Item("Laptop",2);

        SuitCase s1 = new SuitCase(100);
        s1.printItems();
        s1.addItem(i);
        s1.addItem(i2);
        s1.addItem(i3);
        s1.printItems();

        SuitCase s2 = new SuitCase(200);
        s2.addItem(i);

        Item h = s1.heaviestItem();
        System.out.println(h.getWeight());

        Hold hold = new Hold(250);
        hold.addSuitcase(s1);
        hold.addSuitcase(s2); //cant add s2 as it will exceed maxweight of hold class

        System.out.println(hold);

    }
}
