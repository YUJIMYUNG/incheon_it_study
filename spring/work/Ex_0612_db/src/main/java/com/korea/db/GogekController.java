package com.korea.db;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.GogekDAO;
import dao.SawonDAO;
import lombok.RequiredArgsConstructor;
import vo.GogekVO;
import vo.SawonVO;

@Controller
@RequiredArgsConstructor
public class GogekController {
	public static final String VIEW_PATH = "/WEB-INF/views/gogek/";
	
	final GogekDAO gogek_dao;
	
	@RequestMapping("gogek_list")
	public String list(Model model) {
		
		List<GogekVO> list = gogek_dao.selectList();
		model.addAttribute("list",list);
		return "/WEB-INF/views/gogek/gogek_list.jsp";
	}
}
