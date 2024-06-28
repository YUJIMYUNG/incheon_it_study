package com.korea.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.rest.dao.ProductDAO;
import com.korea.rest.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceimpl implements ProductService{
	
	
	private final ProductDAO productDAO;
	@Override
	public List<ProductVO> getList() {
		
		return productDAO.findAll();
	}
	
	
	public void register(ProductVO productVO) {
		productDAO.save(productVO);
		
	}

}
