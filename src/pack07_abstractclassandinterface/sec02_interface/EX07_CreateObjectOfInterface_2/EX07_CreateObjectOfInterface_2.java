package pack07_abstractclassandinterface.sec02_interface.EX07_CreateObjectOfInterface_2;

/*�͸��̳�Ŭ������ Ȱ���� �������̽�Ÿ���� ��ü ���� (���#2)*/

interface A {
	int a = 3;
	void abc() ;
}

public class EX07_CreateObjectOfInterface_2 {
	public static void main(String[] args) {

		//#2. �͸� �̳�Ŭ����
		A a1 = new A() {
			@Override
			public void abc() {
				System.out.println("���#2. �߻�޼��� ���� (�̿ϼ�-> �ϼ�)");			
			}
		};
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("���#2. �߻�޼��� ���� (�̿ϼ�-> �ϼ�)");			
			}
		};
	}
}