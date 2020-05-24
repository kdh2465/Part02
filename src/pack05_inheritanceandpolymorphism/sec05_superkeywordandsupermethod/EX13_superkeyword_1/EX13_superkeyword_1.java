package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX13_superkeyword_1;

class A {
	void abc() {
		System.out.println("A 클래스 abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B 클래스 abc()");
	}
	void bcd() {
		abc(); // this.abc();
	}
}

public class EX13_superkeyword_1 {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		B bb = new B();
		
		//#2. 메서드
		bb.bcd(); // B 클래스 abc();
		
	}
}
