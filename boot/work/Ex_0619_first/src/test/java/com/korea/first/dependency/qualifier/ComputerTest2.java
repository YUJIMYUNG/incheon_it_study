package com.korea.first.dependency.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class ComputerTest2 {
	
//	@Autowired @Qualifier("laptop")
//	Computer laptop;
//	
//	@Autowired @Qualifier("desktop")
//	Computer desktop;
//	
//	@Test
//	public void getScreenWidth() {
//		log.info(""+laptop.getScreenWidth());
//		log.info(""+desktop.getScreenWidth());
//	}
	
	
	@Autowired
	Computer computer;
	
	@Test
	public void getScreenWidth() {
		log.info(""+computer.getScreenWidth());
	}
}
