package pack07_abstractclassandinterface.sec02_interface.EX06_CreateObjectOfInterface_1;

/*자식클래스의 직접 정의를 통한 인터페이스타입의 객체 생성 (방법#1)*/

interface A {
	int a = 3;
	void abc() ;
}

//#1-1. 인터페이스를 상속한 자식클래스 생성
class B implements A {
	@Override
	public void abc() {
		System.out.println("방법#1. 추상메서드 구현 (미완성-> 완성)");		
	}
}

public class EX06_CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		//#1-2. 상속한 일반클래스를 이용하여 객체 생성
		B b1 = new B();
		b1.abc();
		
		B b2 = new B();
		b2.abc();		
		
	} 
}
