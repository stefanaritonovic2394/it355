/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.mapper;

import com.it355.stefanaritonovic.model.Proizvod;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author stefa
 */
public class ProductMapper implements RowMapper<Proizvod> {

    @Override
    public Proizvod mapRow(ResultSet rs, int arg1) throws SQLException {
        Proizvod proizvod = new Proizvod();
        proizvod.setId(rs.getInt("id"));
        proizvod.setNaziv(rs.getString("name"));
        proizvod.setOpis(rs.getString("description"));
        proizvod.setCena(rs.getDouble("price"));
        return proizvod;
    }
    
}
