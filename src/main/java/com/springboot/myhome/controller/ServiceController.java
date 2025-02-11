package com.springboot.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServiceController {

	@GetMapping(value="/service/service.html")
	public ModelAndView mypage() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","service/service.jsp");
		return mav;
	}
}
