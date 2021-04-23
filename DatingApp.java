package com.company;

public class DatingApp {
    public static void main(String[] args) {
        SimpleDate s1 = new SimpleDate(3,12,1995);
        System.out.println(s1);
        s1.advance(27);
        System.out.println(s1);
        s1.advance(4);
        System.out.println(s1);
        SimpleDate s2 = new SimpleDate(27, 10,1995);
        System.out.println(s2);
        s2.advance(5);
        System.out.println(s2);
        //creating new object for afterdays so that s2 won't change
        SimpleDate s3 = s2.afterNumberOfDays(5);
        System.out.println(s3);
        System.out.println(s2);
    }
}
