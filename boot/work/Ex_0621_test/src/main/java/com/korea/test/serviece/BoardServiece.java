package com.korea.test.serviece;

import java.util.List;

import com.korea.test.vo.BoardVO;

public interface BoardServiece {

	//게시글 조회
	public List<BoardVO> boardList();
}
