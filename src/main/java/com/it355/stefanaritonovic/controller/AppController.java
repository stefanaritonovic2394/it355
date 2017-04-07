/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.controller;

import com.it355.stefanaritonovic.model.Order;
import com.it355.stefanaritonovic.service.OrderService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author stefa
 */
@Controller
public class AppController {
    
    @Autowired
    OrderService orderService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String prepareProduct(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = {"/newOrder"}, method = RequestMethod.GET)
    public String prepareOrder(ModelMap model) {
        Order order = new Order();
        model.addAttribute("order", order);
        return "order";
    }

    @RequestMapping(value = {"/newOrder"}, method = RequestMethod.POST)
    public String sendOrder(@Valid Order order, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "order";
        }
        orderService.sendOrder(order);
        model.addAttribute("success", "Order for " + order.getProductName() + " registered.");
        return "ordersuccess";
    }

    @RequestMapping(value = {"/checkStatus"}, method = RequestMethod.GET)
    public String checkOrderStatus(ModelMap model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "orderStatus";
    }
    
}
