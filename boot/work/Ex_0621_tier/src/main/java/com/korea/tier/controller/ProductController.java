package com.korea.tier.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

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
	
	@GetMapping("register")
	public String insert(Model model) {
		model.addAttribute("vo", new ProductVO());
		return "product/product-insert";
	}
	
	@PostMapping("register")
	public RedirectView insert(ProductVO productVO) {
		productService.register(productVO);
		return new RedirectView("list");
	}
}
