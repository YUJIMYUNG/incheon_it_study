package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import vo.GogekVO;
import vo.SawonVO;

@RequiredArgsConstructor
public class GogekDAO {
	
	@NonNull
	SqlSession sqlSession;
	
	//전체고객 조회
	public List<GogekVO> selectList(){
		return sqlSession.selectList("gogek.gogek_list");
	}
}
