package pack07_innerclassandinterface.sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	
	void abc() {
		System.out.println("A Ŭ����  �޼���");		
	}
	
	class B {
		void bcd() {
			//#1. outer class �ʵ� ���
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			//#2. outer class �޼��� ���
			abc();
		}
	}
}
public class EX01_CreateObjectAndAccessMember {
	public static void main(String[] args) {
		//#3. instance inner Ŭ���� ��ü ����
		//@3.1. outer class ��ü ����
		A a = new A();
		//@3.2 outer ���������� ���� innerŬ���� ��ü ����
		A.B b = a.new B();
		b.bcd();
	}

}
