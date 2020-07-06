package pack07_abstractclassandinterface.sec02_interface.EX08_DefaultMethod_1;

/*인터페이스 구현 및 디폴트메서드의 오버라이딩*/

interface A {
	void abc(); //2020년 개발
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	}
}
//#1. 추상메서드만 구현
class B implements A{
	@Override
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}
//#2. 추상메서드 구현 + 디폴트 메서드 오버라이딩
class C implements A {
	@Override
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	};
}

public class EX08_DefaultMethod_1 {
	public static void main(String[] args) {
		//#1. B 객체 생성 및 메서드 호출
		B b = new B();
		b.abc();	//B 클래스의 abc()
		b.bcd();	//A 인터페이스의 bcd()
		
		//#2. C 객체 생성 및 메서드 호출
		C c = new C();
		c.abc();	//B 클래스의 abc()
		c.bcd();	//C 클래스의 bcd()
	}

}
