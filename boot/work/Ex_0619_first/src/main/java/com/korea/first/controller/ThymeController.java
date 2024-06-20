package com.korea.first.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.first.vo.UserVO;

@Controller
public class ThymeController {

	@RequestMapping("/ex01")
	public String ex01(Model model) {
		model.addAttribute("LastName","kim");
		model.addAttribute("firstName","Gildong");
		return "ex01";
	}
	
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		List<String> list = new ArrayList<String>();
		model.addAttribute("list",list);
		
		model.addAttribute("userNum",3);
		return "ex02";
	}
	
	@RequestMapping("/ex03")
	public String ex03(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("복숭아");
		list.add("딸기");
		list.add("참외");
		list.add("수박");
		model.addAttribute("list", list);
		model.addAttribute("firstPage",1);
		model.addAttribute("lastPage",10);
		return "ex03";
	}
	
	@RequestMapping("/ex04")
	public String ex04(Model model) {
		
		model.addAttribute("user", new UserVO("Gildong", 40));
		return "ex04";
	}
	
	//입력하는 폼 페이지로 이동
	@RequestMapping("/ex05")
	public String ex05(Model model) {
		model.addAttribute("user",new UserVO("gildong", 40));
		return "ex05";
	}
	@RequestMapping("/result")
	public String ex05(@ModelAttribute("vo") UserVO vo) {
		
		return "ex06";
	}

	@RequestMapping("/ex07")
	public String ex07(Model model) {
		
	
		return "ex07";
	}
	@RequestMapping("/ex08")
	public String ex08(Model model) {
		
		model.addAttribute("firstName", "Gildong");
		model.addAttribute("list", Arrays.asList("aaa","bbb","ccc","ddd","eee"));
		model.addAttribute("vo", new UserVO("Kim",50));
		return "ex08";
	}
	
	@RequestMapping("/ex09")
	public String ex09(Model model) {
		Integer[] arr = {1,2,3,4,5};
		model.addAttribute("arr", arr);
		return "ex09";
	}
}
