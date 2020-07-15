package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX03_OverridingVsOverloading;

/*�޼��� �������̵� vs. �޼��� �����ε�*/

class A {
	void print1() {
		System.out.println("A Ŭ���� print1");
	}
	void print2() {
		System.out.println("A Ŭ���� print2");
	}
}

class B extends A {
	void print1() {
		System.out.println("B Ŭ���� print1");
	}
	void print2(int a) {
		System.out.println("B Ŭ���� print2");
	}
}

public class EX03_OverridingVsOverloading {
	public static void main(String[] args) {
		
		//#1. A Ÿ�� ���� A ��ü ����
		A aa = new A();
		aa.print1(); //A Ŭ���� print1
		aa.print2(); //A Ŭ���� print2


		//#2. B Ÿ�� ���� B ��ü ����
		B bb = new B();
		bb.print1(); //B Ŭ���� print1
		bb.print2(); //A Ŭ���� print2
		bb.print2(3); //B Ŭ���� print2


		//#3. A Ÿ�� ���� B ��ü ���� (������ ǥ��)
		A ab = new B();
		ab.print1(); //B Ŭ���� print1
		ab.print2(); //A Ŭ���� print2
		//ab.print2(3); // ����

	}

}
