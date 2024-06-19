package com.korea.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

	@RequestMapping("/ex01")
	public String ex01(Model model) {
		model.addAttribute("lastName","kim");
		return "ex01";
	}
}
