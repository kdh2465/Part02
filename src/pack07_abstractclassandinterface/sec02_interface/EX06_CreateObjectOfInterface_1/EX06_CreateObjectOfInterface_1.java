package pack07_abstractclassandinterface.sec02_interface.EX06_CreateObjectOfInterface_1;

/*�ڽ�Ŭ������ ���� ���Ǹ� ���� �������̽�Ÿ���� ��ü ���� (���#1)*/

interface A {
	int a = 3;
	void abc() ;
}

//#1-1. �������̽��� ����� �ڽ�Ŭ���� ����
class B implements A {
	@Override
	public void abc() {
		System.out.println("���#1. �߻�޼��� ���� (�̿ϼ�-> �ϼ�)");		
	}
}

public class EX06_CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		//#1-2. ����� �Ϲ�Ŭ������ �̿��Ͽ� ��ü ����
		B b1 = new B();
		b1.abc();
		
		B b2 = new B();
		b2.abc();		
		
	} 
}
