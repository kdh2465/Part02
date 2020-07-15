package pack04_modifier_1.sec02_staticmodifier.EX01_StaticField_1;

/*인스턴스 필드와 정적필드의 활용 방법*/

public class EX01_StaticField_1 {
	public static void main(String[] args) {
	
		//#1. 인스턴스 필드 활용 방법 (1.객체 생성  2.필드사용)
		A a1 = new A();
		System.out.println(a1.m); 	//3
				
		//#2. static 필드 활용 방법 
		//@방법 #1 (1.클래스이름으로 바로 접근)
		System.out.println(A.n); 	//5
		//@방법 #2 (1.객체 생성  2.필드사용)
		A a2 = new A();
		System.out.println(a2.n); 	//5
				
	}
}
