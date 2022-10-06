/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_store;

/**
 *
 * @author victo
 */
public class Provider {
    private int id;
    private String productName;
    private String providerName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return productName;
    }

    public void setName(String newProductName) {
        this.productName = newProductName;
    }

    public String getProvider() {
        return providerName;
    }

    public void setProvider(String provider) {
        this.providerName = provider;
    }
}
