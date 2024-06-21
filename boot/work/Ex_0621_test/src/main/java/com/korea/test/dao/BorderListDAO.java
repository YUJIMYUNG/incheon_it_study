package com.korea.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.korea.test.mapper.BorderMapper;
import com.korea.test.vo.BorderListVO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BorderListDAO {
	
	private final BorderMapper borderMapper;
	
	//게시글 조회
	public List<BorderListVO> selectAll(){
		return borderMapper.select();
	}
	
}
