/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

/**
 *
 * @author stefa
 */
public class Korisnik {
    
    private String korisnickoIme;
    private String email;
    private String lozinka;
    
    public Korisnik() {
        
    }
    
    public Korisnik(String korisnickoIme, String email, String lozinka) {
        this.korisnickoIme = korisnickoIme;
        this.email = email;
        this.lozinka = lozinka;
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
    
}
