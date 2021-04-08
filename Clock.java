package com.company;
//print time in format hh:mm:ss  24hr clock
public class Clock {
    public static void main(String[] args) {
        int hours = 0;
        int minute = 0;
        int seconds = 0;

        while(true){          //indefinite print of time
            if(hours<10){
                System.out.print("0");
            }
            System.out.print(hours);
            System.out.print(":");
            if(minute<10){
                System.out.print("0");
            }
            System.out.print(minute);
            System.out.print(":");
            if(seconds<10){
                System.out.print("0");
            }
            System.out.print(seconds);
            System.out.println();

            seconds+=1;
            if(seconds>59){
                minute+=1;
                seconds=0;
            }
            if(minute>59){
                hours+=1;
                minute=0;
            }
            if(hours>23){
                hours=0;
            }
        }

    }
}
