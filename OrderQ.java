package com.company;

public class OrderQ {
    public static void main(String[] args) {
        Customer c1 = new Customer("akash","aligarh");
        Order o1 = new Order(1,"aloeVera",1,c1);
        System.out.println(o1.postalAddress());
        c1.setAddress("pune");
        System.out.println(o1.postalAddress());
    }
}
