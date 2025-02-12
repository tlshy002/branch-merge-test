package com.springboot.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MypageController {
	
	@GetMapping(value="/mypage/profile.html") //마이페이지 > 내정보 이동
	public ModelAndView profile() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY","mypage/mypage.jsp");
		mav.addObject("CONTENT", "profile.jsp");
		return mav;	
	}
	
	 @GetMapping(value="/mypage/orders.html") //마이페이지 > 주문정보 이동
	    public ModelAndView orders() {
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("BODY", "mypage/mypage.jsp");
	        mav.addObject("CONTENT", "orders.jsp");
	        return mav;
	    }
	 
	 @GetMapping(value="/mypage/returns.html") //마이페이지 > 환불 이동
	    public ModelAndView returns() {
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("BODY", "mypage/mypage.jsp");
	        mav.addObject("CONTENT", "returns.jsp");
	        return mav;
	    }
	 
	 
	 @GetMapping(value="/mypage/support.html") //마이페이지 > FAQ 이동
	    public ModelAndView support() {
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("BODY", "mypage/mypage.jsp");
	        mav.addObject("CONTENT", "support.jsp");
	        return mav;
	    }
	 
	 @GetMapping(value="/mypage/product-inquiry.html") //마이페이지 > 문의사항 이동
	    public ModelAndView productinquiry() {
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("BODY", "mypage/mypage.jsp");
	        mav.addObject("CONTENT", "product-inquiry.jsp");
	        return mav;
	    }
	 
	 @GetMapping(value="/mypage/notice.html") //마이페이지 > 공지사항 이동
	    public ModelAndView notice() {
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("BODY", "mypage/mypage.jsp");
	        mav.addObject("CONTENT", "notice.jsp");
	        return mav;
	    }
}
