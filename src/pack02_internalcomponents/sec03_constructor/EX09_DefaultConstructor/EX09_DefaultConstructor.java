package pack02_internalcomponents.sec03_constructor.EX09_DefaultConstructor;

class A {
	A() {
		System.out.println("ù��° ������");
	}
	A(int a) {
		System.out.println("�ι�° ������");
	}
	A(int a, int b) {
		System.out.println("����° ������");
	}
}

public class EX09_DefaultConstructor {
	public static void main(String[] args) {
		
		//#1. �� ���� �����ڸ� �̿��� ������ ��ü ���� ���
		A a1 = new A(); 	//ù��° ������
		A a2 = new A(3); 	//�ι�° ������
		A a3 = new A(3,5); 	//�ι�° ������
		
	}
}
