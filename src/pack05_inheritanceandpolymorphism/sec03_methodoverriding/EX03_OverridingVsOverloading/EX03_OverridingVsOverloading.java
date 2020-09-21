package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX03_OverridingVsOverloading;

/*메서드 오버라이딩 vs. 메서드 오버로딩*/

class A {
	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}
}

class B extends A {
	void print1() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {
		System.out.println("B 클래스 print2");
	}
}

public class EX03_OverridingVsOverloading {
	public static void main(String[] args) {
		
		//#1. A 타입 선언 A 객체 생성
		A aa = new A();
		aa.print1(); //A 클래스 print1
		aa.print2(); //A 클래스 print2


		//#2. B 타입 선언 B 객체 생성
		B bb = new B();
		bb.print1(); //B 클래스 print1
		bb.print2(); //A 클래스 print2
		bb.print2(3); //B 클래스 print2


		//#3. A 타입 선언 B 객체 생성 (다형적 표현)
		A ab = new B();
		ab.print1(); //B 클래스 print1
		ab.print2(); //A 클래스 print2
		//ab.print2(3); // 오류

	}

}
