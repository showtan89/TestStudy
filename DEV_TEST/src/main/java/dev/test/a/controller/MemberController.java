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
			
			return "main";
		}
		
		// 회원가입 폼페이지	
		@RequestMapping("inputForm")	
		public String inputForm() {
			System.out.println("url : inputForm()");
			
			return "inputForm";
		}
		

		// 중복확인 페이지
		@RequestMapping("confirmId")
		public String confirmId(HttpServletRequest req, Model model) {
			System.out.println("url : confirmId()");
			
			//MemberServiceImpl service = new MemberServiceImpl();
			service.confirmId(req, model);
			
			return "confirmId";
		}
		
		// 회원가입 처리페이지
		@RequestMapping("inputPro")
		public String inputPro(HttpServletRequest req, Model model) {
			System.out.println("url : inputPro()");
			
			//MemberServiceImpl service = new MemberServiceImpl();
			service.inputPro(req, model);
			
			return "inputPro";
		}
		
		// 회원가입 성공
		@RequestMapping("mainSuccess")
		public String mainSuccess(HttpServletRequest req, Model model) {
			System.out.println("url : mainSuccess()");
			
			int cnt = Integer.parseInt(req.getParameter("insertCnt"));
			req.setAttribute("cnt", cnt);
			
			return "main";
		}
		
		// 로그인
		@RequestMapping("loginPro")
		public String loginPro(HttpServletRequest req, Model model) {
			System.out.println("url : loginPro()");
			
			service.loginPro(req, model);
			
			return "main";
		}
		
		// 로그아웃
		@RequestMapping("logout")
		public String logout(HttpServletRequest req, Model model) {
			System.out.println("url : logout()");
			
			req.getSession().removeAttribute("memId");
			req.setAttribute("cnt", 2);
			
			return "main";
		}
		
		// 회원정보 수정 - 패스워드 입력
		@RequestMapping("modifyForm")
		public String modifyForm() {
			System.out.println("url : modifyForm()");
			
			return "modifyForm";
		}
		
		// 회원정보 상세 수정페이지 
		@RequestMapping("modifyView")
		public String modifyView(HttpServletRequest req, Model model) {
			System.out.println("url : modifyView()");
			
			service.modifyView(req, model);
			
			return "modifyView";
		}
		
		// 회원정보 수정 처리페이지	
		@RequestMapping("modifyPro")
		public String modifyPro(HttpServletRequest req, Model model) {
			System.out.println("url : modifyPro()");
			
			service.modifyPro(req, model);
			
			return "modifyPro";
		}
		
		// 회원정보 삭제 - 패스워드 입력	
		@RequestMapping("deleteForm")
		public String deleteForm() {
			System.out.println("url : deleteForm()");
			
			return "deleteForm";
		}
		
		// 회원정보 삭제 처리	
		@RequestMapping("deletePro")
		public String deletePro(HttpServletRequest req, Model model) {
			System.out.println("url : deletePro()");
			
			service.deletePro(req, model);
			
			return "deletePro";
		}
}
