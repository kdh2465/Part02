package pack06_abstractclassandinterface.sec01_abstractclass.EX02_CreateObjectOfAbstractClass_2;

abstract class A {
	abstract void abc() ;
}

public class EX02_CreateObjectOfAbstractClass_2 {
	public static void main(String[] args) {

		//#2. �͸� �̳�Ŭ����
		A a1 = new A() {
			@Override
			void abc() {
				System.out.println("�߻�޼��� ���� (�̿ϼ�-> �ϼ�)");			
			}
		};
		A a2 = new A() {
			@Override
			void abc() {
				System.out.println("�߻�޼��� ���� (�̿ϼ�-> �ϼ�)");			
			}
		};
	}
}
