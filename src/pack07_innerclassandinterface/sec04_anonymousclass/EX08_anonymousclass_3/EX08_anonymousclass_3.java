package pack07_innerclassandinterface.sec04_anonymousclass.EX08_anonymousclass_3;

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

public class EX08_anonymousclass_3 {
	public static void main(String[] args) {
		
		C c = new C();
		
		//#1. ��� 1. Ŭ������ O + ���������� O
		A a = new B();
		c.cde(a);
		
		//#2. ��� 2. Ŭ������ O + ���������� X
		c.cde(new B());
		
		
	}
}
