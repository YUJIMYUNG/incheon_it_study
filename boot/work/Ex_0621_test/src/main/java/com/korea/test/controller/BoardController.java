package com.korea.test.controller;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.korea.test.dao.BoardDAO;
import com.korea.test.serviece.BoardServiece;
import com.korea.test.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	final BoardServiece boardServiece;
	
	//게시글 목록 페이지 
	@GetMapping("boardList")
	public String list(Model model) {
		List<BoardVO> list = boardServiece.boardList();
		model.addAttribute("list", list);
		return "boardList";
	}
	
//	//게시글 작성 페이지 
//	@GetMapping("insertForm")
//	public String list(Model model) {
//		
//	}
	
	//게시글 조회 페이지
//	@GetMapping("boardView")
//	public String boardView(Model model) {
//		
//	}
}
