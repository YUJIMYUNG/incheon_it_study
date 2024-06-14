package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import vo.SawonVO;

@RequiredArgsConstructor
public class SawonDAO {
	
	@NonNull
	SqlSession sqlSession;
	
	//전체사원 조회
	public List<SawonVO> selectList(){
		return sqlSession.selectList("sawon.sawon_list");
	}
}
