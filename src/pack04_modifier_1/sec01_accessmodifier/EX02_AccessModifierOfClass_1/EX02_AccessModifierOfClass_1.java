package pack04_modifier_1.sec01_accessmodifier.EX02_AccessModifierOfClass_1;

/*같은 패키지에서의 클래스 접근지정자 vs. 생성자 접근지정자*/

public class EX02_AccessModifierOfClass_1 {
	public static void main(String[] args) {
		
		A a = new A(); //객체 생성 가능 = 생성자 호출 가능
		B b = new B(); //객체 생성 가능 = 생성자 호출 가능
		C c = new C(); //객체 생성 가능 = 생성자 호출 가능
		
	}
}
