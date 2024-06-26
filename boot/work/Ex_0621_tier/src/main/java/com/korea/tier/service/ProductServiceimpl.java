package com.korea.tier.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.tier.dao.ProductDAO;
import com.korea.tier.vo.ProductVO;

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
