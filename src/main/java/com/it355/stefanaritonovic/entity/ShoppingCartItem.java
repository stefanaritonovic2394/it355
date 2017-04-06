/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author stefa
 */
@Entity
@Table(name = "shoppingcartitems")
public class ShoppingCartItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;
    
    @Column(name = "quantity")
    public Integer quantity;
    
    @Column(name = "total")
    public Double total;
    
    @Column(name = "enabled")
    private Boolean enabled = Boolean.TRUE;
    
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
    public Product product;
    
    @ManyToOne
    @JoinColumn(name = "SHOPPINGCART_ID", referencedColumnName = "ID")
    public ShoppingCart shoppingCart;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Double getTotal() {
        return total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    
    public Boolean getEnabled() {
        return enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
    
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    
    @Override
    public String toString() {
        return "ShoppingCartItem{" + "id=" + id + ", quantity=" + quantity + ", total=" + total + ", enabled=" + enabled + ", product=" + product + ", shoppingCart=" + shoppingCart + '}';
    }
    
}
