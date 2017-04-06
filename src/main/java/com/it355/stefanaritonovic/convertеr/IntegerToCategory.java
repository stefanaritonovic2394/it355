/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.convertеr;

import com.it355.stefanaritonovic.dao.ShoppingCartDao;
import com.it355.stefanaritonovic.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author stefa
 */
@Component
public class IntegerToCategory implements Converter<String , Category> {
    
    @Autowired
    ShoppingCartDao shoppingCartDao;
    
    @Override
    public Category convert(String s) {
        if(s.isEmpty()) {
            return null;
        }
        Integer value = Integer.valueOf(s);
        System.out.println("Konvertujem u kategoriju");
        Category cat = shoppingCartDao.getCategoryById(value);
        return cat;
    }
    
}
