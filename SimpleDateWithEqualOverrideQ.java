package com.company;

public class SimpleDateWithEqualOverrideQ {
    public static void main(String[] args) {
        SimpleDateWithEqualsOverride s1 = new SimpleDateWithEqualsOverride(3,12,1996);
        SimpleDateWithEqualsOverride s2 = new SimpleDateWithEqualsOverride(3,12,1996);

        SimpleDateWithEqualsOverride s3 = s2;
        System.out.println(s1.equals(s2)); // since all classes extend object class we need to overide default equals method.
        //otherwise it will print false.
        System.out.println(s3.equals(s2)); //true


    }
}
