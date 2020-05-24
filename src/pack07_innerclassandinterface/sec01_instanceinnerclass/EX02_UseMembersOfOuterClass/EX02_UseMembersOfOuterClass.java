package pack07_innerclassandinterface.sec01_instanceinnerclass.EX02_UseMembersOfOuterClass;

class A {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A Ŭ���� �޼���");
	}

	class B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B Ŭ���� �޼���");
		}
		void bcd() {
			// #1. outer class �ʵ�/�޼��� ���
			System.out.println(a);
			System.out.println(b);
			abc();

			// #2. outer class �ʵ�/�޼��� ���
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}

public class EX02_UseMembersOfOuterClass {
	public static void main(String[] args) {
		//#3. instance inner Ŭ���� ��ü ����
		//@3.1. outer class ��ü ����
		A a = new A();
		//@3.2 outer ���������� ���� innerŬ���� ��ü ����
		A.B b = a.new B();
		b.bcd();
	}
}
