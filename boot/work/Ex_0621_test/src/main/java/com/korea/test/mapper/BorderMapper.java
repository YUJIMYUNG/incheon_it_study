package com.korea.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.test.vo.BorderListVO;

@Mapper
public interface BorderMapper {
	
	//게시글 조회 
	public List<BorderListVO> select();
	

	
	
}
