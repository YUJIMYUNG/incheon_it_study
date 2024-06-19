package com.korea.first.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("desktop") @Primary
public class Desktop implements Computer{
	@Override
	public int getScreenWidth() {
		// TODO Auto-generated method stub
		return 1920;
	}
}
