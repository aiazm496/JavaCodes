package com.company;
//.equals() is used to compare two objects //in-built method like toString.
// returns true if two reference var point to same object

import java.util.ArrayList;

public class EqualsObject {
    public static void main(String[] args) {
        SimpleDate s1  = new SimpleDate(3,12,1995);
        SimpleDate s2 = new SimpleDate(5,6,1997);
        SimpleDate s3 = new SimpleDate(3,12,1995);

        //s1 and s3 are not equal because they refer to diff objects in memory.
        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal");
        }else{
            System.out.println("s1 and s3 are not equal");
        }
        //s3 = s1; //s3 now refers to same obj which s1 is referring to.
        //System.out.println("s1 and s3 are equal: " + s3.equals(s1));
        System.out.println(s1==s3);
        s3 = s1; //s3 now refers to same obj which s1 is referring to.
        System.out.println("s1 and s3 are equal: " + s3.equals(s1));
        System.out.println(s1==s3);


    }

}
