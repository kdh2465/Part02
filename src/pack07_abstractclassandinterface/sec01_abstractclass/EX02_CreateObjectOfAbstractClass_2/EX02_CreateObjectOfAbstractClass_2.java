package pack07_abstractclassandinterface.sec01_abstractclass.EX02_CreateObjectOfAbstractClass_2;

/*�͸��̳�Ŭ������ Ȱ���� �߻�Ŭ����Ÿ���� ��ü ���� (���#2)*/

abstract class A {
	abstract void abc() ;
}

public class EX02_CreateObjectOfAbstractClass_2 {
	public static void main(String[] args) {

		//#2. �͸� �̳�Ŭ����
		A a1 = new A() {
			@Override
			void abc() {
				System.out.println("���#2. �߻�޼��� ���� (�̿ϼ�-> �ϼ�)");			
			}
		};
		A a2 = new A() {
			@Override
			void abc() {
				System.out.println("���#2. �߻�޼��� ���� (�̿ϼ�-> �ϼ�)");			
			}
		};
		a1.abc();
		a2.abc();
	}
}
