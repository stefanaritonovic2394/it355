/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.service;

import com.it355.stefanaritonovic.model.Order;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author stefa
 */
@Service("orderRepository")
public class OrderRepositoryImpl implements OrderRepository {
    
    private final Map<String, Order> orders = new ConcurrentHashMap<String, Order>();

    @Override
    public void putOrder(Order order) {
        orders.put(order.getOrderId(), order);
    }

    @Override
    public Order getOrder(String orderId) {
        return orders.get(orderId);

    }

    @Override
    public Map<String, Order> getAllOrders() {
        return orders;
    }
    
}
