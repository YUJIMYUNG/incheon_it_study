package com.korea.db;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.SawonDAO;
import lombok.RequiredArgsConstructor;
import vo.SawonVO;

@Controller
@RequiredArgsConstructor
public class SawonController {
	public static final String VIEW_PATH = "/WEB-INF/views/sawon/";
	
	final SawonDAO sawon_dao;
	
	@RequestMapping("sawon_list")
	public String list(Model model) {
		
		List<SawonVO> list = sawon_dao.selectList();
		model.addAttribute("list",list);
		return "/WEB-INF/views/sawon/sawon_list.jsp";
	}
}
