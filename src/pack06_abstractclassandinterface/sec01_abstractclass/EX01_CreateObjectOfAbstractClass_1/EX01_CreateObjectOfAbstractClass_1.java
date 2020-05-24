package pack06_abstractclassandinterface.sec01_abstractclass.EX01_CreateObjectOfAbstractClass_1;

abstract class A {
	abstract void abc() ;
}

//#1-1. 추상클래스를 상속한 자식클래스 생성
class B extends A {
	@Override
	void abc() {
		System.out.println("추상메서드 구현 (미완성-> 완성)");		
	}
}

public class EX01_CreateObjectOfAbstractClass_1 {
	public static void main(String[] args) {
		//#1-2. 상속한 일반클래스를 이용하여 객체 생성
		B b1 = new B();
		b1.abc();
		
		B b2 = new B();
		b2.abc();		
		
	}
}
