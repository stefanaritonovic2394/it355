/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.service.impl;

import com.it355.stefanaritonovic.dao.ProizvodDao;
import com.it355.stefanaritonovic.model.Proizvod;
import com.it355.stefanaritonovic.service.ProizvodService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author stefa
 */
public class ProizvodServiceImpl implements ProizvodService {
    
    @Autowired
    ProizvodDao proizvodDao;

    @Override
    public int getCount() {
        return proizvodDao.getCount();
    }

    @Override
    public List<Proizvod> getAllProducts() {
        return proizvodDao.getAllProducts();
    }

    @Override
    public boolean addProduct(Proizvod proizvod) {
        return proizvodDao.addProduct(proizvod);
    }
    
    @Override
    public boolean updateProduct(Proizvod proizvod) {
        return proizvodDao.updateProduct(proizvod);
    }

    @Override
    public Proizvod getProductById(int id) {
        return proizvodDao.getProductById(id);
    }

    @Override
    public boolean deleteProduct(int id) {
        return proizvodDao.deleteProduct(id);
    }
    
}
