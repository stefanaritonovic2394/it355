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
public class Proizvod implements Serializable {
    
    private int id;
    private String naziv;
    private String opis;
    private double cena;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNaziv() {
        return naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public String getOpis() {
        return opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    public double getCena() {
        return cena;
    }
    
    public void setCena(double cena) {
        this.cena = cena;
    }
    
    @Override
    public String toString() {
        return "Proizvod [id=" + id + ", naziv=" + naziv + ", opis=" + opis + ", cena=" + cena + "]";
    }
    
}
