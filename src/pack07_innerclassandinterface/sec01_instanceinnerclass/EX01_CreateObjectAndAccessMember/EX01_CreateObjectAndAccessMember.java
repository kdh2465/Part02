package pack07_innerclassandinterface.sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	
	void abc() {
		System.out.println("A 클래스  메서드");		
	}
	
	class B {
		void bcd() {
			//#1. outer class 필드 사용
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			//#2. outer class 메서드 사용
			abc();
		}
	}
}
public class EX01_CreateObjectAndAccessMember {
	public static void main(String[] args) {
		//#3. instance inner 클래스 객체 생성
		//@3.1. outer class 객체 생성
		A a = new A();
		//@3.2 outer 참조변수로 부터 inner클래스 객체 생성
		A.B b = a.new B();
		b.bcd();
	}

}
