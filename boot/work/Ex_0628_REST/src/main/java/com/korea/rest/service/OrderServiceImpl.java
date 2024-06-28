package com.korea.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.rest.dao.OrderDAO;
import com.korea.rest.dao.ProductDAO;
import com.korea.rest.vo.OrderDTO;
import com.korea.rest.vo.OrderVO;

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
	
	//주문내역 
	public List<OrderDTO> getList(String sort){
		return orderDAO.findAll(sort);
	}
}
