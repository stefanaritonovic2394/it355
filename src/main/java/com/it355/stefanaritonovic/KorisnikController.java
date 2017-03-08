/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic;

import com.it355.dao.KorisnikDao;
import com.it355.model.Korisnik;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author stefa
 */
@Controller
public class KorisnikController {
    
    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    private KorisnikDao korisnikDao;
    
    @RequestMapping(value = "/korisnik", method = RequestMethod.GET)
    public ModelAndView korisnik() {
        System.out.println("Pozivam message source");
        korisnikDao.addKorisnik();
        System.out.println(messageSource.getMessage("username", null, Locale.ENGLISH));
        return new ModelAndView("korisnik", "command", new Korisnik());
    }
    
    @RequestMapping(value = "/addKorisnik", method = RequestMethod.POST)
    public String addKorisnik(@ModelAttribute Korisnik korisnik, ModelMap model) {
        model.addAttribute("korisnickoIme", korisnik.getKorisnickoIme());
        model.addAttribute("email", korisnik.getEmail());
        model.addAttribute("lozinka", korisnik.getLozinka());
        return "prikaz";
    }
}
