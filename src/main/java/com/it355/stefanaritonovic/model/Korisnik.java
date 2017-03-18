/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.model;

import java.io.Serializable;

/**
 *
 * @author stefa
 */
@SuppressWarnings("serial")
public class Korisnik implements Serializable {
    
    private int id;
    private String korisnickoIme;
    private String email;
    private String lozinka;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getKorisnickoIme() {
        return korisnickoIme;
    }
    
    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getLozinka() {
        return lozinka;
    }
    
    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    @Override
    public String toString() {
        return "Korisnik [id=" + id + ", korisnickoIme=" + korisnickoIme + ", email=" + email + ", lozinka=" + lozinka + "]";
    }
    
}
