package com.company;

public class Var {
    public static void main(String[] args) {
        int var = 2;
        double d = 2.0;
        String name = "Akash";
        boolean isApplicable  = true;  //var name should be camelCase

        System.out.println("The variable is : " + var);
        //unlike python, in java you can concatenate string and number
        // in python,it will be "text" + str(var)
        System.out.println("the floating pt var is : " + d);
        System.out.println("the name of applicant is: " + name);
        System.out.println("the boolean is: " + isApplicable);

        var  = 4;  //re-assigning the value of var
        System.out.println("The new value of variable is: " + var);




    }
}
