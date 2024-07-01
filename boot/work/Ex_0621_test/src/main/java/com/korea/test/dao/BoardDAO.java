package com.korea.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.korea.test.mapper.BoardMapper;
import com.korea.test.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
	
	private final BoardMapper boardMapper;
	//private final BoardVO boardVO;
	
	//게시글 목록
	public List<BoardVO> selectAll(){
		return boardMapper.select();
	}
	
	//게시글 작성하기
	
	
	
	//게시글 조회
//	public BoardVO selectPost(int idx) {
//		return boardMapper.select();
//	}
//	
	
}
