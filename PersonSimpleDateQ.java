package com.company;

public class PersonSimpleDateQ {
    public static void main(String[] args) {
        SimpleDate s = new SimpleDate(03,12,1995);
        PersonWithSimpleDateObject p = new PersonWithSimpleDateObject("Akash",s);
        System.out.println(p);
        PersonWithSimpleDateObject p2 = new PersonWithSimpleDateObject("ravi",12,11,1995);
        System.out.println(p2);
        //compare who is older p or p2
        System.out.println("p2 is older than p: " + p2.olderThan(p));
    }
}
