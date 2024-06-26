package com.korea.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.test.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
	//게시글 목록
	public List<BoardVO> select();
	
	//게시글 조회
//	public BoardVO selectView (int idx) {
//		return selectView(idx);
//	}
	
	
}
