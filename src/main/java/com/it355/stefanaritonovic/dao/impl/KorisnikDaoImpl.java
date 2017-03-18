/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.dao.impl;

import com.it355.stefanaritonovic.dao.KorisnikDao;
import com.it355.stefanaritonovic.mapper.UserMapper;
import com.it355.stefanaritonovic.model.Korisnik;
import java.util.List;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author stefa
 */
public class KorisnikDaoImpl implements KorisnikDao {
    
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
        String sql = "SELECT COUNT(*) FROM Korisnik";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }
    
    @Override
    @Transactional
    public List<Korisnik> getAllUsers() {
        String sql= "SELECT * FROM Korisnik";
        List<Korisnik> users = jdbcTemplate.query(sql, new UserMapper());
        return users;
    }
    
    @Override
    @Transactional
    public boolean addUser(Korisnik korisnik) {
        String sql = "INSERT INTO Korisnik " + "(id, username, email, password) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[] {korisnik.getId(), korisnik.getKorisnickoIme(), korisnik.getEmail(), korisnik.getLozinka()});
        return true;
    }

    @Override
    @Transactional
    public boolean updateUser(Korisnik korisnik) {
        String sql = "UPDATE Korisnik SET username=?, email=?, " + "password=? WHERE id=?";
        jdbcTemplate.update(sql, new Object[] {korisnik.getKorisnickoIme(), korisnik.getEmail(), korisnik.getLozinka(), korisnik.getId()});
        return true;
    }

    @Override
    @Transactional
    public Korisnik getUserById(int id) {
        String sql = "SELECT * FROM Korisnik WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[] {id}, new UserMapper());
    }

    @Override
    @Transactional
    public boolean deleteUser(int id) {
        String sql = "DELETE FROM Korisnik WHERE id="+id;
        jdbcTemplate.update(sql, new Object[] {id});
        return true;
    }
    
}
