package com.company;

public class FunctionReturn {
    public static void main(String[] args) {
        int result = onlyGreaterThan10(19);
        System.out.println(result);
    }
    public static int onlyGreaterThan10(int parameter){
        if(parameter<10){
            return 10;
        }
        System.out.println("Parameter is greater than 10.");
        return parameter;
    }
}
