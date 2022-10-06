/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_store;

/**
 *
 * @author victo
 */
public class Shopping_Cart {
    private int id;
    private Products[] products;
    private String customerName;
    private int coupon;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Products[] getProducts() {
        return products;
    }
    public void setProducts(Products[] products) {
        this.products = products;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCoupon() {
        return coupon;
    }
    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }
}
