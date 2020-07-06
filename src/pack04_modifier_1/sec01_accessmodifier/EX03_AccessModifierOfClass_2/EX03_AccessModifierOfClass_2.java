package pack04_modifier_1.sec01_accessmodifier.EX03_AccessModifierOfClass_2;

import pack04_modifier_1.sec01_accessmodifier.EX02_AccessModifierOfClass_1.A;
import pack04_modifier_1.sec01_accessmodifier.EX02_AccessModifierOfClass_1.C;

/*다른 패키지에서의 클래스 접근지정자 vs. 생성자 접근지정자*/

public class EX03_AccessModifierOfClass_2 {
	public static void main(String[] args) {
		
		A a = new A(); //객체 생성 가능 = 생성자 호출 가능
		//B b = new B(); //클래스 자체 사용 불가 (import 불가능)
		//C c = new C(); //생성자 호출 불가
		
	}
}
