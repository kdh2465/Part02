package pack07_innerclassandinterface.sec04_anonymousclass.EX09_anonymousclass_4;

interface A {
	public abstract void abc();
}

class B implements A {
	public void abc(){
		System.out.println("�Ű����� ����");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class EX09_anonymousclass_4 {
	public static void main(String[] args) {
		
		C c = new C();
		
		//#1. ��� 3. Ŭ������ X + ���������� O		
		A a = new A() {
			public void abc() {
				System.out.println("�Ű����� ����");
			};
		};
		c.cde(a);
		
		//#2. ��� 4. Ŭ������ X + ���������� X
		c.cde(new A() {
			public void abc() {
				System.out.println("�Ű����� ����");
			};
		});
		
	}
	
}
