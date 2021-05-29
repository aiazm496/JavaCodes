package com.company;

public class Order {
    private int orderID;
    private String orderName;
    private int count;
    private Customer customer;

    public Order(int orderID, String orderName, int count, Customer customer) {
        this.orderID = orderID;
        this.orderName = orderName;
        this.count = count;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getCount() {
        return count;
    }

    public int getOrderID() {
        return orderID;
    }

    public String postalAddress(){
        return this.customer.getName() + "\n" + this.customer.getAddress();
    }
}
