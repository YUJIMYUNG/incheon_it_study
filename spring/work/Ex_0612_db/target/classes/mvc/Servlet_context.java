package mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.korea.db.DeptController;
import com.korea.db.GogekController;
import com.korea.db.SawonController;

import dao.DeptDAO;
import dao.GogekDAO;
import dao.SawonDAO;

@Configuration
@EnableWebMvc
@ComponentScan("com.korea.db")
public class Servlet_context implements WebMvcConfigurer {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("resources/");
		
	}
	
//	@Bean
//	public InternalResourceViewResolver resolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setViewClass(JstlView.class);
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".jsp");
//		return resolver;
//	}
	
	//수동객체 생성
	@Bean
	public DeptController deptController(DeptDAO dept_dao) {
		return new DeptController(dept_dao);
	}
	
	@Bean
	public SawonController sawonController(SawonDAO sawon_dao) {
		return new SawonController(sawon_dao);
	}
	
	@Bean
	public GogekController gogekController(GogekDAO gogek_dao) {
		return new GogekController(gogek_dao);
	}
}
