/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.model;

/**
 *
 * @author stefa
 */
public enum OrderStatus {
    
    CREATED("Created"),
    PENDING("Pending"),
    CONFIRMED("Confirmed"),
    FAILED("Failed");
    private String status;

    private OrderStatus(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return this.status;
    }

    public String getName() {
        return this.name();
    }
    
}
