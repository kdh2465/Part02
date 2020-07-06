package pack07_abstractclassandinterface.sec02_interface.EX09_DefaultMethod_2;

/*�ڽ�Ŭ�������� �θ��������̽��� ����Ʈ�޼��� ȣ��*/

interface A {
	default void abc(){
		System.out.println("A �������̽��� abc()");
	}
}
//#1. �ڽ�Ŭ�������� �θ� �������̽� ����Ʈ �޼��� ȣ��
class B implements A{
	@Override
	public void abc() {
		A.super.abc();
		System.out.println("B Ŭ������ abc()");
	}	
}

public class EX09_DefaultMethod_2 {
	public static void main(String[] args) {
		//#1. B ��ü ���� �� �޼��� ȣ��
		B b = new B();
		b.abc();	//A �������̽��� abc() -> B Ŭ������ abc()				
	}
}
