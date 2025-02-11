package com.springboot.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@GetMapping("/login/login.html")
	public ModelAndView login() {
	    ModelAndView mav = new ModelAndView("login/login"); 
	    return mav;
	}
	
	@GetMapping("/login/entry.html")
	public ModelAndView entry() {
	    ModelAndView mav = new ModelAndView("login/entry"); 
	    return mav;
	}
	
	@GetMapping("/login/findbyid.html")
	public ModelAndView findbyid() {
	    ModelAndView mav = new ModelAndView("login/findbyid"); 
	    return mav;
	}
	
	@GetMapping("/login/findbypwd.html")
	public ModelAndView findbypwd() {
	    ModelAndView mav = new ModelAndView("login/findbypwd"); 
	    return mav;
	}
}
