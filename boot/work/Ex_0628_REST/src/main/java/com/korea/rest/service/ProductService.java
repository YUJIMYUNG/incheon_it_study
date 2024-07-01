package com.korea.rest.service;

import java.util.List;

import com.korea.rest.vo.ProductVO;

public interface ProductService {
	
	//컨트롤러 하나에 하나의 쿼리가 나가기때문에 서비스에 대한 목적이 두드러지진 않는다. 
	//여러개를 연동하다보면 하나의 서비스에 여러개의쿼리가 필요하다 보니 하나의 메서드로 묶어서 처리하기 위해 존재한다. 
	//상품 추가 
	public void register(ProductVO productVO);
	
	//상품 조회 
	public List<ProductVO> getList();
	
	
	public ProductVO getProduct(int productId);
}
