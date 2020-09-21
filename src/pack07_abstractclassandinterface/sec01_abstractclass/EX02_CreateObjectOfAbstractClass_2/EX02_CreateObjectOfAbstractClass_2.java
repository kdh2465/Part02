package pack07_abstractclassandinterface.sec01_abstractclass.EX02_CreateObjectOfAbstractClass_2;

/*익명이너클래스를 활용한 추상클래스타입의 객체 생성 (방법#2)*/

abstract class A {
	abstract void abc() ;
}

public class EX02_CreateObjectOfAbstractClass_2 {
	public static void main(String[] args) {

		//#2. 익명 이너클래스
		A a1 = new A() {
			@Override
			void abc() {
				System.out.println("방법#2. 추상메서드 구현 (미완성-> 완성)");			
			}
		};
		A a2 = new A() {
			@Override
			void abc() {
				System.out.println("방법#2. 추상메서드 구현 (미완성-> 완성)");			
			}
		};
		a1.abc();
		a2.abc();
	}
}
