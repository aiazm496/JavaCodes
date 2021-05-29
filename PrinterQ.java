package com.company;

public class PrinterQ {
    public static void main(String[] args) {
        TextMessage t = new TextMessage("akash","hello!");
        Printer p = new Printer();
        System.out.println(p.print(t));
    }
}
