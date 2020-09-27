package dev.test.a.persistence;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dev.test.a.vo.MemberVo;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Override
	public int idCheck(String strId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertMember(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int idPwdCheck(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVo getMemberInfo(String strId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String strId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
