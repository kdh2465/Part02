package pack06_abstractclassandinterface.sec01_abstractclass.EX01_CreateObjectOfAbstractClass_1;

abstract class A {
	abstract void abc() ;
}

//#1-1. �߻�Ŭ������ ����� �ڽ�Ŭ���� ����
class B extends A {
	@Override
	void abc() {
		System.out.println("�߻�޼��� ���� (�̿ϼ�-> �ϼ�)");		
	}
}

public class EX01_CreateObjectOfAbstractClass_1 {
	public static void main(String[] args) {
		//#1-2. ����� �Ϲ�Ŭ������ �̿��Ͽ� ��ü ����
		B b1 = new B();
		b1.abc();
		
		B b2 = new B();
		b2.abc();		
		
	}
}
