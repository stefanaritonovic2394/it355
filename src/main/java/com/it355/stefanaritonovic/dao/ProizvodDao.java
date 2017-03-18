/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.dao;

import com.it355.stefanaritonovic.model.Proizvod;
import java.util.List;

/**
 *
 * @author stefa
 */
public interface ProizvodDao {
    
    public int getCount();
    public List<Proizvod> getAllProducts();
    public boolean addProduct(Proizvod proizvod);
    public boolean updateProduct(Proizvod proizvod);
    public Proizvod getProductById(int id);
    public boolean deleteProduct(int id);
    
}
