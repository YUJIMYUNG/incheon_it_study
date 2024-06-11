package vo;

import lombok.Data;
import lombok.Setter;

//@Getter : getter메서드 생성
//@Setter : setter메서드 생성 
//@NoArgsConstructor : 파라미터 없는 생성자 
//@AllArgsConstructor : 모든 필드를 매개변수로 갖는 생성자 
//@RequireArgsConstructor : final 이나 @NonNull인 필드만 매개변수로 갖는 생성자
//@Data :getter,setter,RequiredArgsConstructor, ToString, Equals, HashCode를 한 번에 설정 

@Data
public class PersonVO {


	String name;
	int age;

	
}
