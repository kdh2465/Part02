package pack02_internalcomponents.sec03_constructor.EX10_ConstructorOverloading;

/*다양한 생성자를 사용한 다양한 객체 생성 방법*/

class A {
	A() {
		System.out.println("첫번째 생성자");
	}
	A(int a) {
		System.out.println("두번째 생성자");
	}
	A(int a, int b) {
		System.out.println("세번째 생성자");
	}
}

public class EX10_ConstructorOverloading {
	public static void main(String[] args) {
	
		//#1. 세 가지 생성자를 이용한 세가지 객체 생성 방법
		A a1 = new A(); 	//첫번째 생성자
		A a2 = new A(3); 	//두번째 생성자
		A a3 = new A(3,5); 	//두번째 생성자

	}
}
