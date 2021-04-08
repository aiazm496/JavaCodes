package com.company;

public class PrimitiveVarMethodCall {
    public static void main(String[] args) {
        int number  = 1;
        //number is name for memory location at
        //which value of 1 is copied.
        System.out.println("Number: " + number);
        call(number);
        System.out.println("Number is still: " + number);
    }
    //value of var number is copied thus, var number in main
    //method can't be mutated.
    public static void call(int number){
            number+=1;
    }

}
