package com.springboot.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LikeController {
	
	@GetMapping(value="/like/likelist.html")
	public ModelAndView likelist() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","like/likelist.jsp");
		return mav;
	}
}
