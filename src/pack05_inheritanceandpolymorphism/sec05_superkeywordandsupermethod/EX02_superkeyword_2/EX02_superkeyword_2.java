package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX02_superkeyword_2;

/*멤버앞에 super 키워드를 사용한 경우의 메서드 호출*/

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
		super.abc(); //부모 객체의 abc()
	}
}

public class EX02_superkeyword_2 {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		B bb = new B();
		
		//#2. 메서드
		bb.bcd(); // B 클래스 abc();
		
	}
}
