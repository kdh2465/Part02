package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX13_superkeyword_1;

/*����տ� ���������� ����(this.)�ϴ� ����� �޼��� ȣ��*/

class A {
	void abc() {
		System.out.println("A Ŭ���� abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B Ŭ���� abc()");
	}
	void bcd() {
		abc(); // this.abc();
	}
}

public class EX13_superkeyword_1 {
	public static void main(String[] args) {
		
		//#1. ��ü ����
		B bb = new B();
		
		//#2. �޼���
		bb.bcd(); // B Ŭ���� abc();
		
	}
}
