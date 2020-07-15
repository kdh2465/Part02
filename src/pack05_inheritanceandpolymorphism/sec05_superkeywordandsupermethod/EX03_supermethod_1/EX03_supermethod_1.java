package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX15_supermethod_1;

/*super() �޼����� ��� �� �����Ͽ� ���� �ڵ��߰� super()*/

class A {
	A() {
		System.out.println("A ������");
	}
}

class B extends A {
	B() {
		super(); // ������ �ڵ����� �߰���
		System.out.println("B ������");
	}
}

class C {
	C(int a) {
		System.out.println("C ������");
	}
}
/* ����
 * class D extends C {
 * 
 * //�����Ϸ��� �߰����ִ� �κ� 
 * D(){ super();  }
 * 
 * }
 */

public class EX15_supermethod_1 {
	public static void main(String[] args) {
		//#1. A ��ü ����
		A aa = new A(); // A ������
		
		//#2. B ��ü ����
		B bb = new B(); // A ������ B ������
	}
}
