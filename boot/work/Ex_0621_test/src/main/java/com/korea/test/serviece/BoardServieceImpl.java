package com.korea.test.serviece;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.test.dao.BoardDAO;
import com.korea.test.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServieceImpl implements BoardServiece{
	
	private final BoardDAO boardDAO;
	@Override
	public List<BoardVO> boardList() {
		return boardDAO.selectAll();
	}
}
