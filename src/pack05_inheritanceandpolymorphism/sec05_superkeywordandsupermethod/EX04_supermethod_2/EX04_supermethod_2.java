package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX04_supermethod_2;

/*this()�޼���� super() �޼����� ȥ��*/

class A {
	A() {
		this(3);
		System.out.println("A ������1");
	}
	A(int a) {
		System.out.println("A ������2");
	}
}

class B extends A {
	B() {
		this(3);
		System.out.println("B ������1");
	}
	B(int a) {
		System.out.println("B ������2");
	}
}

public class EX04_supermethod_2 {
	public static void main(String[] args) {
		
		//#1. A ��ü ����
		A aa1 = new A(); 	// A ������2 -> A ������1 
		A aa2 = new A(2); 	// A ������2
		System.out.println();
		
		//#2. B ��ü ����
		B bb1 = new B();	// A ������2 -> A ������1 -> B ������2 -> B ������1
		B bb2 = new B(2);	// A ������2 -> A ������1 -> B ������2

	}
}

