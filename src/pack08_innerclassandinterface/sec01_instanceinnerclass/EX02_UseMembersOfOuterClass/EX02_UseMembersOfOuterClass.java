package pack08_innerclassandinterface.sec01_instanceinnerclass.EX02_UseMembersOfOuterClass;

/*이너클래스 내부에서 외부 클래스의 필드/메서드 사용*/

class A {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A 클래스 메서드");
	}

	class B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		void bcd() {
			// #1. inner class 필드/메서드 사용
			System.out.println(a);
			System.out.println(b);
			abc();

			// #2. outer class 필드/메서드 사용
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}

public class EX02_UseMembersOfOuterClass {
	public static void main(String[] args) {
		//#3. instance inner 클래스 객체 생성
		//@3.1. outer class 객체 생성
		A a = new A();
		//@3.2 outer 참조변수로 부터 inner클래스 객체 생성
		A.B b = a.new B();
		b.bcd();
	}
}
