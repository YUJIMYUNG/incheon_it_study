package dao;

import org.apache.ibatis.session.SqlSession;

import lombok.RequiredArgsConstructor;
import vo.MemberVO;

@RequiredArgsConstructor
public class MemberDAO {

		final SqlSession sqlSession;
		
		//아이디가 존재하는지 조회 
		public MemberVO loginCheck(String id) {
			return sqlSession.selectOne("m.loginCheck",id);
		}
		
		//회원가입 
		public int insert(MemberVO vo) {
			return sqlSession.insert("m.member_insert", vo);
		}
		
		
		
}
