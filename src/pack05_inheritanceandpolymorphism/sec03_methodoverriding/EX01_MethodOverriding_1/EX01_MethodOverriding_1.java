package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX01_MethodOverriding_1;

/*�޼��� �������̵��� �⺻ ����*/

class A {
	void print() {
		System.out.println("A Ŭ����");
	}
}

class B extends A {
	void print() {
		System.out.println("B Ŭ����");
	}
}

public class EX01_MethodOverriding_1 {
	public static void main(String[] args) {
		
		//#1. A Ÿ�� ���� A ��ü ����
		A aa = new A();
		aa.print(); //A Ŭ����
		
		//#2. B Ÿ�� ���� B ��ü ����
		B bb = new B();
		bb.print(); //B Ŭ����
		
		//#3. A Ÿ�� ���� B ��ü ���� (������ ǥ��)
		A ab = new B();
		ab.print(); //B Ŭ����
			
	}

}
