/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author stefa
 */
@Controller
public class HelloController {
    
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView defaultPage() {
        
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Ovo je pocetna strana!");
        model.setViewName("hello");
        return model;
        
    }
    
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Ovo je strana za admine!");
        model.setViewName("admin");
        return model;
        
    }
    
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome() {
        
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Ovo je strana dobrodoslice!");
        model.setViewName("welcome");
        return model;
        
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout) {
        
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Pogresni login podaci!");
        }
        
        if (logout != null) {
            model.addObject("msg", "Izlogovani ste.");
        }
        model.setViewName("login");
        
        return model;
        
    }
    
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {
        
        ModelAndView model = new ModelAndView();
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            System.out.println(userDetail);
            
            model.addObject("username", userDetail.getUsername());
            
        }
        
        model.setViewName("403");
        return model;
        
    }
    
}
