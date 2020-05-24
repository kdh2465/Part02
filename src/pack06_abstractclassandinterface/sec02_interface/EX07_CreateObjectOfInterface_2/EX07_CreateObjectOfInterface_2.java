package pack06_abstractclassandinterface.sec02_interface.EX07_CreateObjectOfInterface_2;

interface A {
	int a = 3;
	void abc() ;
}

public class EX07_CreateObjectOfInterface_2 {
	public static void main(String[] args) {

		//#2. 익명 이너클래스
		A a1 = new A() {
			@Override
			public void abc() {
				System.out.println("추상메서드 구현 (미완성-> 완성)");			
			}
		};
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("추상메서드 구현 (미완성-> 완성)");			
			}
		};
	}
}
