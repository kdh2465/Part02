package pack07_innerclassandinterface.sec05_innerinterface.EX10_CreateObjectOfInnerInterface;

class A{
	interface B{
		public abstract void bcd();
	}
}
//객체생성 방법 1-1. 이너인터페이스 구현 클래스 생성
class C implements A.B{
	public void bcd() {
		System.out.println("이너인터페이스 구현 클래스 생성");
	};
}

public class EX10_CreateObjectOfInnerInterface {
	public static void main(String[] args) {
		//객체 생성 방법 1-2. 구현 클래스로 객체 생성
		C c = new C();
		c.bcd();
		
		//객체 생성 방법 2. 익명이너클래스로 객체 생성
		A.B b = new A.B() {
			@Override
			public void bcd() {
				System.out.println("익명이너클래스로 객체 생성");				
			}
		};
		b.bcd();		
	}
}
