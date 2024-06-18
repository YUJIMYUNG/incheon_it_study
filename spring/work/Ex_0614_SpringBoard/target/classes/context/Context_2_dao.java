package context;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.BoardDAO;
import dao.MemberDAO;

@Configuration
public class Context_2_dao {
	//프로젝트를 실행하면 Webinitializer가 실행이 되고 
	//모든 Context를 읽으며 메모리에 객체를 미리 올려습니다. 
	//우리는 필요할 때 호출만 하여 이미 올라간 메모리를 필드에 주입한다. 
	
	@Bean
	public BoardDAO board_dao(SqlSession sqlSession) {
		BoardDAO dao = new BoardDAO(sqlSession);
		return dao;
		
		//혹은
		//return new BoardDAO(sqlSession);
	}
	
	@Bean
	public MemberDAO member_dao(SqlSession sqlSession) {
		return new MemberDAO(sqlSession);
	}
	
}
