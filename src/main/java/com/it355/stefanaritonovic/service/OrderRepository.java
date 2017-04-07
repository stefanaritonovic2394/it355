/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.service;

import com.it355.stefanaritonovic.model.Order;
import java.util.Map;

/**
 *
 * @author stefa
 */
public interface OrderRepository {
    
    public void putOrder(Order order);

    public Order getOrder(String orderId);

    public Map<String, Order> getAllOrders();
    
}
