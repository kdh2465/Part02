package pack03_externalcomponents.sec02_externalclass.EX03_ExternalClass_1;

//�ϳ��� ���Ͽ� �ܺ� Ŭ���� �ۼ�

class A {
	int m=3;
	int n=4;
	void print() {
		System.out.println(m+", "+n);
	}
}

public class EX03_ExternalClass_1 {
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}
