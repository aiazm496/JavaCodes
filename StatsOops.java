package com.company;
import java.util.Scanner;

public class StatsOops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics st = new Statistics();
        Statistics stEven = new Statistics();
        Statistics stOdd = new Statistics();
        while(true){
            int a = Integer.parseInt(scanner.nextLine());
            if(a==-1){
                break;
            }
            st.addNumber(a);
            if(a%2==0){
                stEven.addNumber(a);
            }
            if(!(a%2==0)){
                stOdd.addNumber(a);
            }
        }
        /*st.addNumber(4);
        st.addNumber(5);
        st.addNumber(2);
        st.addNumber(1);*/
        System.out.println("Count of numbers: " + st.getCount());

        System.out.println("The sum of numbers: " + st.sum());
        System.out.println("sum of even nos: " + stEven.sum());
        System.out.println("sum of odd nos: " + stOdd.sum());
        System.out.println("The average of numbers is: " + st.average());
    }
}