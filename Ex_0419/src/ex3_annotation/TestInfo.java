package ex3_annotation;

import java.lang.annotation.*;

@Target({TYPE, FIELD, TYPE_Use, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {

		String Value() default "정보1";
		String[] testTool() default"Info1";
		String tester();
		DateTime datetime();
		
}
