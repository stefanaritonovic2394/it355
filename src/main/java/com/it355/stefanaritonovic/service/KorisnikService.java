/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.service;

import com.it355.stefanaritonovic.model.Korisnik;
import java.util.List;

/**
 *
 * @author stefa
 */
public interface KorisnikService {
    
    public int getCount();
    public List<Korisnik> getAllUsers();
    public boolean addUser(Korisnik korisnik);
    public boolean updateUser(Korisnik korisnik);
    public Korisnik getUserById(int id);
    public boolean deleteUser(int id);
    
}
