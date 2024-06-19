package com.korea.first.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
public class Coding {
	
	//필드주입 
//	@Autowired
//	private Computer computer; //코딩을 하기 위해선 컴퓨터 객체가 필요하다. 
	//computer = new Computer(); new를 통해 객체를 직접 생성하지는 않을것 
	
	
	//생성자 주입
	final Computer computer;
	
//	public Coding(Computer computer) {
//		this.computer = computer;
//	}
	
}
