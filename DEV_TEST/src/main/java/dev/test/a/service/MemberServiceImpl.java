package dev.test.a.service;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import dev.test.a.persistence.MemberDAO;
import dev.test.a.persistence.MemberDAOImpl;
import dev.test.a.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired   // @Inject
	MemberDAO dao;

	@Override
	public void confirmId(HttpServletRequest req, Model model) {
		// TODO Auto-generated method stub
		// 3단계. 화면으로부터 입력받은 값을 받아온다.
		String strId = req.getParameter("id");
		
		// 4단계. 다형성적용, 싱글톤 방식으로 dao 객체 생성
		//MemberDAO dao = new MemberDAOImpl();
		//MemberDAO dao = MemberDAOImpl.getInstance();
		
		// 5단계. 중복된 id가 있는지 확인
		int cnt = dao.idCheck(strId);
		
		// 6단계. request나 session에 처리 결과를 저장(jsp에 전달하기 위함)
		req.setAttribute("selectCnt", cnt);
		req.setAttribute("id", strId);
	}

	@Override
	public void inputPro(HttpServletRequest req, Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginPro(HttpServletRequest req, Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyView(HttpServletRequest req, Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPro(HttpServletRequest req, Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePro(HttpServletRequest req, Model model) {
		// TODO Auto-generated method stub
		
	}

}
