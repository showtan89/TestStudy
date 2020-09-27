package dev.test.a.persistence;

import java.util.Map;

import dev.test.a.vo.MemberVo;

public interface MemberDAO {
	
	// 중복확인 체크
	public int idCheck(String strId);
	
	// 회원가입 처리페이지
	public int insertMember(MemberVo vo);
	
	// 로그인처리, 회원정보수정시 비밀번호 인증, 회원정보탈퇴시 비밀번호 인증 
	public int idPwdCheck(Map<String, Object> map);
	
	// 회원정보수정 상세페이지
	public MemberVo getMemberInfo(String strId);
	
	// 회원정보수정 처리
	public int updateMember(MemberVo vo);
	
	// 회원정보 삭제 처리
	public int deleteMember(String strId);

}
