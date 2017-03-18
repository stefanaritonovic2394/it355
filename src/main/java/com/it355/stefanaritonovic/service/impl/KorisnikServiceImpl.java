/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.service.impl;

import com.it355.stefanaritonovic.dao.KorisnikDao;
import com.it355.stefanaritonovic.model.Korisnik;
import com.it355.stefanaritonovic.service.KorisnikService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author stefa
 */
public class KorisnikServiceImpl implements KorisnikService {
    
    @Autowired
    KorisnikDao korisnikDao;

    @Override
    public int getCount() {
        return korisnikDao.getCount();
    }

    @Override
    public List<Korisnik> getAllUsers() {
        return korisnikDao.getAllUsers();
    }

    @Override
    public boolean addUser(Korisnik korisnik) {
        return korisnikDao.addUser(korisnik);
    }
    
    @Override
    public boolean updateUser(Korisnik korisnik) {
        return korisnikDao.updateUser(korisnik);
    }

    @Override
    public Korisnik getUserById(int id) {
        return korisnikDao.getUserById(id);
    }

    @Override
    public boolean deleteUser(int id) {
        return korisnikDao.deleteUser(id);
    }
    
}
