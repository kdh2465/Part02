package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX14_superkeyword_2;

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
		this.abc(); // this.abc();
	}
}

public class EX14_superkeyword_2 {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		B bb = new B();
		
		//#2. 메서드
		bb.bcd(); // B 클래스 abc();
		
	}
}
