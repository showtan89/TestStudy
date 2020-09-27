package dev.test.a.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.test.a.service.MemberServiceImpl;

@Controller
public class MemberController {

	@Autowired
	MemberServiceImpl service;
	
	// 첫 메인페이지
		@RequestMapping("main")
		public String main(Model model) {
			System.out.println("url : main");
			
			model.addAttribute("cnt", 2); // 환영합니다.
			
			return "member/main";
		}
}
