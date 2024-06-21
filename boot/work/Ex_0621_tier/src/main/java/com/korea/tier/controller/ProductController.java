package com.korea.tier.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.tier.service.ProductService;
import com.korea.tier.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product/*")
public class ProductController {
	final ProductService productService;
	
	
	@GetMapping("list")
	public String list(Model model) {
		List<ProductVO> list = productService.getList();
		model.addAttribute("list",list);
		
		return "product/product-list";
	}
}
