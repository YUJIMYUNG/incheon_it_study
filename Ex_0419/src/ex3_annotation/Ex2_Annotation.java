package ex3_annotation;

@TestInfo("테스트정보")
public class Ex2_Annotation {
	public static void main(String[] args) {
		Annotation[] annos = Ex2_Annotation.class.getAnnotations();
		
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		
		TestInfo testInfo = Ex2_Annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.Value());
	}
}
