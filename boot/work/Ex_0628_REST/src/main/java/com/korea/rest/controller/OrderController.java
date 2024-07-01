package com.korea.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.rest.service.OrderService;
import com.korea.rest.vo.OrderDTO;
import com.korea.rest.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@RequestMapping("/order/*")
@RequiredArgsConstructor
@RestController
//@RestController 
//Restful Web API를 좀 더 쉽게 만들기 위해 스프링4.0에 도입된 기능이다. 
//@Controller와 @ResponseBody를 합쳐놓은 어노케이션 
public class OrderController {

	private final OrderService orderService;
	
	@GetMapping("list/{sort}")
	//@PathVariavle : 경로에 있는 변수를 메서드의 매개변수로 바인딩 하는데 사용
	public List<OrderDTO> list(@PathVariable("sort")String sort){
		return orderService.getList(sort);
	}
	
	@PostMapping("write")
	public void register(@RequestBody OrderVO orderVO) {
		orderService.order(orderVO);
	}
}
