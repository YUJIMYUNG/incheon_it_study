package com.korea.rest.service;

import java.util.List;

import com.korea.rest.vo.OrderDTO;
import com.korea.rest.vo.OrderVO;

public interface OrderService {

	//주문하기 
	public void order(OrderVO orderVO);
	
	//주문내역
	public List<OrderDTO> getList(String sort);
}
