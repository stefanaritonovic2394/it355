/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.service;

import com.it355.stefanaritonovic.model.InventoryResponse;
import com.it355.stefanaritonovic.model.Order;
import com.it355.stefanaritonovic.model.OrderStatus;
import com.it355.stefanaritonovic.messaging.MessageSender;
import com.it355.stefanaritonovic.util.BasicUtil;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stefa
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    
    static final Logger LOG = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    MessageSender messageSender;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void sendOrder(Order order) {
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        order.setOrderId(BasicUtil.getUniqueId());
        order.setStatus(OrderStatus.CREATED);
        orderRepository.putOrder(order);
        LOG.info("Application : sending order request {}", order);
        messageSender.sendMessage(order);
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void updateOrder(InventoryResponse response) {
        Order order = orderRepository.getOrder(response.getOrderId());
        if (response.getReturnCode() == 200) {
            order.setStatus(OrderStatus.CONFIRMED);
        } else if (response.getReturnCode() == 300) {
            order.setStatus(OrderStatus.FAILED);
        } else {
            order.setStatus(OrderStatus.PENDING);
        }
        orderRepository.putOrder(order);

    }

    @Override
    public Map<String, Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }
    
}
