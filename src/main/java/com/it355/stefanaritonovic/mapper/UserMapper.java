/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.mapper;

import com.it355.stefanaritonovic.model.Korisnik;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author stefa
 */
public class UserMapper implements RowMapper<Korisnik> {

    @Override
    public Korisnik mapRow(ResultSet rs, int arg1) throws SQLException {
        Korisnik korisnik = new Korisnik();
        korisnik.setId(rs.getInt("id"));
        korisnik.setKorisnickoIme(rs.getString("username"));
        korisnik.setEmail(rs.getString("email"));
        korisnik.setLozinka(rs.getString("password"));
        return korisnik;
    }
    
}
