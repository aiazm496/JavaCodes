package com.company;

public class ReferenceVarMethodRec {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        System.out.println(r);
        ezy(r);
        System.out.println(r); //width reduced by 1  - width = 1
        Rectangle r2 = r; //ref to obj referred by r is also made through r2 now
        ezy(r2);
        System.out.println(r); //again width reduced by 1 width = 0

    }

    public static void ezy(Rectangle o){
        o.narrow();
    }
}
