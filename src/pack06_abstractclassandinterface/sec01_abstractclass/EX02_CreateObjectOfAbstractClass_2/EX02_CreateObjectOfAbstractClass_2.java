package pack06_abstractclassandinterface.sec01_abstractclass.EX02_CreateObjectOfAbstractClass_2;

abstract class A {
	abstract void abc() ;
}

public class EX02_CreateObjectOfAbstractClass_2 {
	public static void main(String[] args) {

		//#2. 익명 이너클래스
		A a1 = new A() {
			@Override
			void abc() {
				System.out.println("추상메서드 구현 (미완성-> 완성)");			
			}
		};
		A a2 = new A() {
			@Override
			void abc() {
				System.out.println("추상메서드 구현 (미완성-> 완성)");			
			}
		};
	}
}
