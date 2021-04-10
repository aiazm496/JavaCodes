package com.company;
import java.time.LocalDate;

public class LocalDateJava {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        System.out.println("today is " + year  + "-" + month + "-" + day);
    }
}
