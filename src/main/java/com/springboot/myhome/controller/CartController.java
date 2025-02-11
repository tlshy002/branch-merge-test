package com.springboot.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
	
	@GetMapping(value="/cart/cart.html")
	public ModelAndView cart() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","cart/cart.jsp");
		return mav;
	}
}
