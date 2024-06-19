package com.korea.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBOotApplication
//@Configuration : 해당 클래스가 설정파일임을 알려주는 용도 
//@ConponentScan : 자동으로 컴포넌트 클래스를 검색하여 컴포넌트와 Bean클래스를 등록함 
//@EnableAutoConfiguration : 스프링의 다양한 설정이 자동으로 구성되고 완료됨 
public class Ex0619FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex0619FirstApplication.class, args);
	}

}
