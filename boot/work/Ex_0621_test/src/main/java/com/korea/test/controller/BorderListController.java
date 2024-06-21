package com.korea.test.controller;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.korea.test.serviece.BorderServiece;
import com.korea.test.vo.BorderListVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BorderListController {
	final BorderServiece borderServiece;
	
	@GetMapping("list")
	public String list(Model model) {
		List<BorderListVO> list = borderServiece.borderlist();
		model.addAttribute("list", list);
		return "borderList";
	}
}
