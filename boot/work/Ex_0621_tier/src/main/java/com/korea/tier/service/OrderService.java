package com.korea.tier.service;

import java.util.List;

import com.korea.tier.vo.OrderDTO;
import com.korea.tier.vo.OrderVO;

public interface OrderService {

	//주문하기 
	public void order(OrderVO orderVO);
	
	//주문내역
	public List<OrderDTO> getList(String sort);
}
