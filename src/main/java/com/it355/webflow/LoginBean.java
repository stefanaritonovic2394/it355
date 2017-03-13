/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.webflow;

import java.io.Serializable;

/**
 *
 * @author stefa
 */
public class LoginBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "LoginBean [userName=" + userName + ", password=" + password + "]";
    }
    
}
