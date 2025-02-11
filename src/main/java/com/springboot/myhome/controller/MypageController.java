package com.springboot.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MypageController {
	
	@GetMapping(value="/mypage/mypage.html")
	public ModelAndView mypage() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","mypage/mypage.jsp");
		return mav;
	}
}
