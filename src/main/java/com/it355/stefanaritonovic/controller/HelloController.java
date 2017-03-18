/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.controller;

import com.it355.stefanaritonovic.dao.KorisnikDao;
import com.it355.stefanaritonovic.dao.ProizvodDao;
import com.it355.stefanaritonovic.model.Korisnik;
import com.it355.stefanaritonovic.model.Proizvod;
import com.it355.stefanaritonovic.service.KorisnikService;
import com.it355.stefanaritonovic.service.ProizvodService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @Autowired
    KorisnikDao korisnikDao;
    
    @Autowired
    ProizvodDao proizvodDao;
    
    @Autowired
    ProizvodService proizvodService;
    
    @Autowired
    KorisnikService korisnikService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView defaultPage() {
        
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Ovo je strana kojoj svi mogu da pristupe!");
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
    
    @RequestMapping(value="/users", method = RequestMethod.GET)
    public ModelAndView users(ModelAndView modelAndView) {
        List<Korisnik> users = korisnikService.getAllUsers();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("users");
        return modelAndView;
    }
    
    @RequestMapping(value="/products", method = RequestMethod.GET)
    public ModelAndView products(ModelAndView modelAndView) {
        List<Proizvod> products = proizvodDao.getAllProducts();
        
        for (Proizvod proizvod : products) {
            System.err.println(proizvod.toString());
        }
        
        modelAndView.addObject("products", products);
        modelAndView.setViewName("products");
        return modelAndView;
    }
    
    @RequestMapping(value = "/adduser", method = RequestMethod.GET)
    public String addUser(Model model) {
        model.addAttribute("user", new Korisnik());
        return "adduser";
    }
    
    @RequestMapping(value= "/adduser", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") Korisnik p, ModelAndView model) {
        model.addObject("object", p);
        p.setId(korisnikDao.getCount()+1);
        korisnikDao.addUser(p);
        return model;
    }
    
    @RequestMapping(value= "/updateuser/{id}", method = RequestMethod.GET)
    public ModelAndView updateUser(@PathVariable int id, ModelAndView model) {
        korisnikDao.getUserById(id);
        return model;
    }
    
    @RequestMapping(value= "/updateuser", method = RequestMethod.POST)
    public ModelAndView updateUser(@ModelAttribute("user") Korisnik p, ModelAndView model) {
        model.addObject("object", p);
        p.setId(korisnikDao.getCount()+1);
        korisnikDao.updateUser(p);
        return model;
    }
    
    @RequestMapping(value= "/deleteuser/{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable int id, ModelAndView model) {
        korisnikDao.deleteUser(id);
        return model;
    }
    
    @RequestMapping(value = "/addproduct", method = RequestMethod.GET)
    public String addProduct(Model model) {
        model.addAttribute("product", new Proizvod());
        return "addproduct";
    }
    
    @RequestMapping(value= "/addproduct", method = RequestMethod.POST)
    public ModelAndView addProduct(@ModelAttribute("product") Proizvod p, ModelAndView model) {
        model.addObject("object", p);
        p.setId(proizvodDao.getCount()+1);
        proizvodService.addProduct(p);
        return model;
    }
    
}
