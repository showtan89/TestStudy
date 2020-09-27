package dev.test.a.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface MemberService {
	// 중복확인 처리
	public void confirmId(HttpServletRequest req, Model model);
	
	// 회원가입 처리 
	public void inputPro(HttpServletRequest req, Model model);
	
	// 로그인 처리
	public void loginPro(HttpServletRequest req, Model model);
	
	// 회원정보 상세 페이지
	public void modifyView(HttpServletRequest req, Model model);
	
	// 회원정보 수정 처리
	public void modifyPro(HttpServletRequest req, Model model);
	
	// 회원정보 삭제 처리
	public void deletePro(HttpServletRequest req, Model model);
}
