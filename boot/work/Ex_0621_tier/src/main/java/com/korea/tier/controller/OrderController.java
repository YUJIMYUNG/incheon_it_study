package com.korea.tier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.tier.service.OrderService;
import com.korea.tier.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("order/*")
public class OrderController {
	
	private final OrderService orderService;
	
	//주문을 하는 기능
	@GetMapping("done")
	public RedirectView order(OrderVO vo) {
//		OrderVO vo = new OrderVO();
//		vo.setProductId(1);
//		vo.setProductCount(5);
		System.out.println("주문개수: " + vo.getProductCount());
		orderService.order(vo);
		
		return new RedirectView("/product/list");
	}
}
