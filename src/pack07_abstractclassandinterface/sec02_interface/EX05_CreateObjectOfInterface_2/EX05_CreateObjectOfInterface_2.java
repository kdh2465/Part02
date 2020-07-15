package pack07_abstractclassandinterface.sec02_interface.EX05_CreateObjectOfInterface_2;

/*익명이너클래스를 활용한 인터페이스타입의 객체 생성 (방법#2)*/

interface A {
	int a = 3;
	void abc() ;
}

public class EX05_CreateObjectOfInterface_2 {
	public static void main(String[] args) {

		//#2. 익명 이너클래스
		A a1 = new A() {
			@Override
			public void abc() {
				System.out.println("방법#2. 추상메서드 구현 (미완성-> 완성)");			
			}
		};
		a1.abc();
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("방법#2. 추상메서드 구현 (미완성-> 완성)");			
			}
		};
		a2.abc();
	}
}
