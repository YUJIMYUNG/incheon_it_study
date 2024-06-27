package com.korea.tier.service;

import org.springframework.stereotype.Service;

import com.korea.tier.dao.OrderDAO;
import com.korea.tier.dao.ProductDAO;
import com.korea.tier.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
	
	
	private final OrderDAO orderDAO;
	private final ProductDAO productDAO;
	
	@Override
	public void order(OrderVO orderVO) {
		orderDAO.save(orderVO); //주문
		productDAO.setProductStock(orderVO); //재고 수정
		
	}
}
