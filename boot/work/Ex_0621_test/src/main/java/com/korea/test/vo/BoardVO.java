package com.korea.test.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int idx; //게시글 번호
	private String name, //작성자
			subject, //게시글 제목
			content, //게시글 내용
			regdate;//작성 날짜
}
