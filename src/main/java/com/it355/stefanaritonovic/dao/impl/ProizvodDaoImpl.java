/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.dao.impl;

import com.it355.stefanaritonovic.dao.ProizvodDao;
import com.it355.stefanaritonovic.mapper.ProductMapper;
import com.it355.stefanaritonovic.model.Proizvod;
import java.util.List;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author stefa
 */
public class ProizvodDaoImpl implements ProizvodDao {
    
    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    @Transactional
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM Proizvod";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }
    
    @Override
    @Transactional
    public List<Proizvod> getAllProducts() {
        String sql= "SELECT * FROM Proizvod";
        List<Proizvod> products = jdbcTemplate.query(sql, new ProductMapper());
        return products;
    }
    
    @Override
    @Transactional
    public boolean addProduct(Proizvod proizvod) {
        String sql = "INSERT INTO Proizvod " + "(name, description, price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, new Object[] {proizvod.getNaziv(), proizvod.getOpis(), proizvod.getCena()});
        return true;
    }
    
    @Override
    @Transactional
    public boolean updateProduct(Proizvod proizvod) {
        String sql = "UPDATE Proizvod SET name=?, description=?, " + "price=? WHERE id=?";
        jdbcTemplate.update(sql, new Object[] {proizvod.getNaziv(), proizvod.getOpis(), proizvod.getCena(), proizvod.getId()});
        return true;
    }

    @Override
    @Transactional
    public Proizvod getProductById(int id) {
        String sql = "SELECT * FROM Proizvod WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[] {id}, new ProductMapper());
    }

    @Override
    @Transactional
    public boolean deleteProduct(int id) {
        String sql = "DELETE FROM Proizvod WHERE id="+id;
        jdbcTemplate.update(sql, new Object[] {id});
        return true;
    }
    
}
