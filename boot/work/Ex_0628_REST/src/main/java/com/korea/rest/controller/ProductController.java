package com.korea.rest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.rest.service.ProductService;
import com.korea.rest.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product/*")
public class ProductController {
	final ProductService productService;
	
	
	@GetMapping("list")
	public String list(Model model) {
		List<ProductVO> list = productService.getList();
		model.addAttribute("productForm",new ProductVO());
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
	
	
	@PostMapping("new")
	@ResponseBody  //JSON의 키 값이 vo의 필드로 잡힌다. 
	public void register(@RequestBody ProductVO vo) {
		System.out.println("컨트롤러 들어옴");
		productService.register(vo);
	}
}
