package pack02_internalcomponents.sec03_constructor.EX10_ConstructorOverloading;

class A {
	int m;
	void work() {
		System.out.println(m);
	}
	//�⺻������ �ڵ� �߰� A(){}
}

class B{	
	int m;
	void work() {
		System.out.println(m);
	}
	B(){ //�⺻������
		
	}
}

class C{
	int m;
	void work() {
		System.out.println(m);
	}
	C(int a){ //�⺻������
		m=a;
	}
}

public class EX10_ConstructorOverloading {
	public static void main(String[] args) {
		
		//#1. �⺻�����ڸ� �̿��� ��ü ����
		A a = new A();
		B b = new B();
		//C c = new C(); //���� (�⺻������ ����)
		C c = new C(3);
		
		//#2. �޼��� ȣ��
		a.work();	//0
		b.work();	//0
		c.work();	//3
	}
}
