package com.korea.tier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.tier.vo.OrderVO;
import com.korea.tier.vo.ProductVO;

@Mapper
public interface ProductMapper {
	
	//상품 조회
	public List<ProductVO> selectAll();
	
	//상품추가 
	public void insert(ProductVO productVO); 
	
	//재고 수정 
	public void updateStock(OrderVO orderVO);
	
}
