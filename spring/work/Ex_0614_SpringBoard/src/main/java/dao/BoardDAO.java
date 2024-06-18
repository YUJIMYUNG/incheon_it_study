package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import lombok.RequiredArgsConstructor;
import vo.BoardVO;

@RequiredArgsConstructor
public class BoardDAO {
	
	
	final SqlSession sqlSession;
	
	//sqlSession을 매개변수로 갖는 생성자 
	//주입받기 위해서는 생성자가 호출 
	//public BoardDAO(qlSession sqlSession){
	// this.SqlSEssion = sqlSession;
	// }
	
	//등수를 매긴 전체 게시글 조회 
	public List<BoardVO> selectList(HashMap<String, Integer> map){
		return sqlSession.selectList("b.board_list", map);
	}
	
	//전체 게시물 수 조회 
	public int getRowTotal() {
		
		return sqlSession.selectOne("b.board_count");
	}
	
	//상세 페이지 조회 
	public BoardVO selectPost(int idx) {
		
		return sqlSession.selectOne("b.board_select", idx);
	}
	
	//게시물 조회수 증가 
	public int update_readhit(int idx) {
		return sqlSession.update("b.board_update", idx);
	}
	
	//게시물 등록 
	public int insert(BoardVO vo) {
		return sqlSession.insert("b.board_insert",vo);
	}
	
	//게시물 삭제
	public int delete(BoardVO vo) {
		return sqlSession.update("b.board_del", vo);
	}
	
	//답글 step업데이트 
	public int update_step(BoardVO vo) {
		return sqlSession.insert("b.board_update",vo);
	}
	
	//답글 달기
	public int reply(BoardVO vo) {
		return sqlSession.insert("b.reply_form",vo);
	}
	
}
