package com.springboot.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MenuController {
	
	@GetMapping(value="/menu/top.html")
	public ModelAndView top() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","item/top.jsp");
		return mav;
	}
	
	@GetMapping(value="/menu/bottom.html")
	public ModelAndView bottom() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","item/bottom.jsp");
		return mav;
	}
	
	@GetMapping(value="/menu/outer.html")
	public ModelAndView outer() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","item/outer.jsp");
		return mav;
	}
	
	@GetMapping(value="/menu/shoes.html")
	public ModelAndView shoes() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","item/shoes.jsp");
		return mav;
	}
	
}
