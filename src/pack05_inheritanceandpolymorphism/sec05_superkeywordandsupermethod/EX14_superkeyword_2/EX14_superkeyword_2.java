package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX14_superkeyword_2;

/*����տ� super Ű���带 ����� ����� �޼��� ȣ��*/

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
		super.abc(); //�θ� ��ü�� abc()
	}
}

public class EX14_superkeyword_2 {
	public static void main(String[] args) {
		
		//#1. ��ü ����
		B bb = new B();
		
		//#2. �޼���
		bb.bcd(); // B Ŭ���� abc();
		
	}
}
