package com.springboot.wearwave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.wearwave.model.User;

@Controller
public class LoginController {
	
	@GetMapping("/login/login.html") //로그인 화면 이동
	public ModelAndView login() {
	    ModelAndView mav = new ModelAndView("login/login"); 
	    return mav;
	}
	
	@GetMapping("/login/selectentry.html") //회원가입 선택 이동
	public ModelAndView selectentry() {
	    ModelAndView mav = new ModelAndView("login/selectentry"); 
	    return mav;
	}
	
	@GetMapping("/login/findid.html") //아이디 찾기 이동
	public ModelAndView findid() {
	    ModelAndView mav = new ModelAndView("login/findid"); 
	    return mav;
	}
	
	@GetMapping("/login/findpwd.html") //비밀번호 찾기 이동
	public ModelAndView findpwd() {
	    ModelAndView mav = new ModelAndView("login/findpwd"); 
	    return mav;
	}
	
	@GetMapping("/login/userentry.html") //손님  회원가입 이동
	public ModelAndView userentry(Model model) {
	    ModelAndView mav = new ModelAndView("login/userentry"); 
	    model.addAttribute("user", new User());
	    return mav;
	}
	
	@GetMapping("/login/businessentry.html") //사업자 회원가입 이동
	public ModelAndView businessentry(Model model) {
	    ModelAndView mav = new ModelAndView("login/businessentry");
	    model.addAttribute("user", new User());
	    return mav;
	}
}
