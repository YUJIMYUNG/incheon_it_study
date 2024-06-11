package config;

public class Webinitializer extends AbstractAnnotation{
	//AbstractAnnotationConfigDispatcherServletInitializer
	//스프링에서 제공하는 클래스로 웹 어플리케이션의 초기화를 위한 편리한 기능들을 제공한다. 
	//이 클래스를 사용하면 자바 기반 설정 클래스를 이용하여
	//DispatcherServlet및 ContextLoaderListener를 등록할 수 있다. 
	//이를 통해 web.xeml을 사용하지 않고도 웹 어플리케이션의 초기화를 설정할 수 있다. 
	//해당 클래스를 상속받아 필요한 설정들을 오버라이드하여 사용한다. 
	
	//getRootConfigClasses()
	//프로젝트의 모델 영역의 설정을 담당한다. 
	//데이터베이스 연결풀(DBCP), Mybatis, Mybatis매퍼 등과같은 로직 설정을 담당하는 매서드
	//return new Class[] {RootContext.class};
	
	//자바에 와일드카드 
	
	//.class : 클래스 리터럴 
	//클래스 자체를 참조하는 구문 
	//getRootConfigClasses() 오버라이드하기 
	
	//gerServletConfigClasses()
	//DispatcherServlet이 사용할 설정 클래스를 반환한다. 
	//Spring MVC 웹 영역 설정을 담당한다. 
	//View와 Controller 관련 설정을 담당하는 메서드
	//gerServletConfigClasses()오버라이드 
	//return new Class[] {Servlet_context.class};
	
	//getServletMappings()
	//DispathcerServlet의 URL패턴을 지정한다. 
	//모든요청을 처리할 수 있도록 "/"로 설정한다. 
	//getServletMappings() 오버라이드
	//return new String[] {"/"};
	
	//getServletFilters()
	//Client의 요청이 Servlet에 도달하기 전이나 후에 요청 및 응답데이터를 변형하거나
	//추가작업을 수행하는데 사용되는 자바 컴포넌트
	//getServletFilters()오버라이드 
	//return 위로 아래 구문 기재 
	//CharacterEncodionFilter chracterEncodingFilter = new CharacterEncodionFilter();
	//chracterEncodingFilter.setEncoding("utf-8");
	//chracterEncodingFilter.setForceEncoding(true);
	//return new Filter[] {chracterEncodingFilter};
	
	
	
}
