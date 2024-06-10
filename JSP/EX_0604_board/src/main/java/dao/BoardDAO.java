package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.BoardVO;

public class BoardDAO {

	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static BoardDAO single = null;

	public static BoardDAO getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new BoardDAO();
		//생성된 객체정보를 반환
		return single;
	}
	
	SqlSessionFactory factory;
	
	public BoardDAO() {
		factory = MyBatisConnector.getInstance().getSqlSessionFactory();
	}
	
	
	//전체 게시물 조회
	//id : board_list
	//쿼리문은 ref를 내림차순으로, step을 오름차순으로 조회해주세요
	public List<BoardVO> selectList(HashMap<String, Integer>map){
		SqlSession sqlSession = factory.openSession();
		List<BoardVO> list = sqlSession.selectList("b.board_list", map);
		sqlSession.close();
		return list;
	}
	
	public int insert(BoardVO vo) {
		SqlSession sqlSession = factory.openSession(true);
		int res = sqlSession.insert("b.board_insert",vo);
		sqlSession.close();
		return res;
	}
	
	public BoardVO selectOne(int idx) {
		SqlSession sqlSession = factory.openSession();
		BoardVO vo = sqlSession.selectOne("b.board_one",idx);
		sqlSession.close();
		return vo;
	}
	
	public int update_readhit(int idx) {
		//id : board_reahit
		//조회수를 1증가시키는 쿼리문 작성
		SqlSession sqlSession = factory.openSession(true);
		int res = sqlSession.update("b.board_readhit",idx);
		sqlSession.close();
		return res;
	}
	
	public int update_step(BoardVO vo) {
		SqlSession sqlSession = factory.openSession(true);
		int res = sqlSession.update("b.board_update_step",vo);
		sqlSession.close();
		return res;
	}
	
	public int reply(BoardVO vo) {
		SqlSession sqlSession = factory.openSession(true);
		int res = sqlSession.insert("b.board_reply",vo);
		sqlSession.close();
		return res;
	}
	
	public int del_update(BoardVO vo) {
		SqlSession sqlSession = factory.openSession(true);
		int res = sqlSession.update("b.del_update",vo);
		sqlSession.close();
		return res;
	}
	
	public int getRowTotal() {
		SqlSession sqlSession = factory.openSession();
		int res = sqlSession.selectOne("b.board_count");
		sqlSession.close();
		return res;
	}
	
	
}
