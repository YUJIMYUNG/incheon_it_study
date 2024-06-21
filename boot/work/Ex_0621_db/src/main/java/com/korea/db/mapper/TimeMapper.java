package com.korea.db.mapper;

import org.apache.ibatis.annotations.Mapper;

//Mapper설정파일(xml)에 있는 SQL쿼리문을 호출하기 위한 인터페이스 
//DAO대신 @Mapper 어노테이션을 사용한다.(mybaits 3.0이상) 
//@Mapper 어노테이션을 사용하면 @Bean으로 등록되며 Service단에서 
//@Autowired하여 사용할 수 있다. 
//메서드명은 Mapper.xml파일의 id와 맞춰야 한다. 

@Mapper
public interface TimeMapper {
	public String getTime();//쿼리문과 1대1로 매치됨 
	
}
