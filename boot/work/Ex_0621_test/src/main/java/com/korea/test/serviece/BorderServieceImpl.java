package com.korea.test.serviece;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.test.dao.BorderListDAO;
import com.korea.test.vo.BorderListVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BorderServieceImpl implements BorderServiece{
	
	private final BorderListDAO borderListDAO;
	@Override
	public List<BorderListVO> borderlist() {
		return borderListDAO.selectAll();
	}
}
