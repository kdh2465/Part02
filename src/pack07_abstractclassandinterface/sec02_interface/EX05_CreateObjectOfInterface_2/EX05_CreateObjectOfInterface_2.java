package pack07_abstractclassandinterface.sec02_interface.EX05_CreateObjectOfInterface_2;

/*�͸��̳�Ŭ������ Ȱ���� �������̽�Ÿ���� ��ü ���� (���#2)*/

interface A {
	int a = 3;
	void abc() ;
}

public class EX05_CreateObjectOfInterface_2 {
	public static void main(String[] args) {

		//#2. �͸� �̳�Ŭ����
		A a1 = new A() {
			@Override
			public void abc() {
				System.out.println("���#2. �߻�޼��� ���� (�̿ϼ�-> �ϼ�)");			
			}
		};
		a1.abc();
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("���#2. �߻�޼��� ���� (�̿ϼ�-> �ϼ�)");			
			}
		};
		a2.abc();
	}
}
