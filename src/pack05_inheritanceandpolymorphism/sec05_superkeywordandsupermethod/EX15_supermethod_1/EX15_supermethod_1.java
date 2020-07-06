package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX15_supermethod_1;

/*super() 메서드의 기능 및 컴파일에 의한 자동추가 super()*/

class A {
	A() {
		System.out.println("A 생성자");
	}
}

class B extends A {
	B() {
		super(); // 생략시 자동으로 추가됨
		System.out.println("B 생성자");
	}
}

class C {
	C(int a) {
		System.out.println("C 생성자");
	}
}
/* 오류
 * class D extends C {
 * 
 * //컴파일러가 추가해주는 부분 
 * D(){ super();  }
 * 
 * }
 */

public class EX15_supermethod_1 {
	public static void main(String[] args) {
		//#1. A 객체 생성
		A aa = new A(); // A 생성자
		
		//#2. B 객체 생성
		B bb = new B(); // A 생성자 B 생성자
	}
}
