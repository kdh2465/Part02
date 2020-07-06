package pack07_abstractclassandinterface.sec02_interface.EX09_DefaultMethod_2;

/*자식클래스에서 부모인터페이스의 디폴트메서드 호출*/

interface A {
	default void abc(){
		System.out.println("A 인터페이스의 abc()");
	}
}
//#1. 자식클래스에서 부모 인터페이스 디폴트 메서드 호출
class B implements A{
	@Override
	public void abc() {
		A.super.abc();
		System.out.println("B 클래스의 abc()");
	}	
}

public class EX09_DefaultMethod_2 {
	public static void main(String[] args) {
		//#1. B 객체 생성 및 메서드 호출
		B b = new B();
		b.abc();	//A 인터페이스의 abc() -> B 클래스의 abc()				
	}
}
