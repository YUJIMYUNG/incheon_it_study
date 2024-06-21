package com.korea.db.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.db.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;
import vo.ProductVO;


@Controller
@RequiredArgsConstructor
public class DBController {

		private final ProductMapper productMapper;
		
		@GetMapping("register")
		public String register(Model model) {
			model.addAttribute("productVO", new ProductVO());
			return "product-insert";
		}
		
		@PostMapping("register")
		public RedirectView register(ProductVO productVO) {
			productMapper.insert(productVO);
			return new RedirectView("list");
		}
		
		@GetMapping("list")
		public String list(Model model) {
			//매서드명 : selectAll()
			List<ProductVO> list = productMapper.selectAll();
			model.addAttribute("list",list);
			
			return "product-list";
		}
}
