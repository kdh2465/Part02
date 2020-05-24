package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX06_MethodOverriding_1;

class A {
	void print() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	void print() {
		System.out.println("B 클래스");
	}
}

public class EX06_MethodOverriding_1 {
	public static void main(String[] args) {
		
		//#1. A 타입 선언 A 객체 생성
		A aa = new A();
		aa.print(); //A 클래스
		
		//#2. B 타입 선언 B 객체 생성
		B bb = new B();
		bb.print(); //B 클래스
		
		//#3. A 타입 선언 B 객체 생성 (다형적 표현)
		A ab = new B();
		ab.print(); //B 클래스
			
	}

}
