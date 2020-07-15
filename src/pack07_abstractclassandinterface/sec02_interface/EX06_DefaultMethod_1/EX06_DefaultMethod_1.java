package pack07_abstractclassandinterface.sec02_interface.EX08_DefaultMethod_1;

/*�������̽� ���� �� ����Ʈ�޼����� �������̵�*/

interface A {
	void abc(); //2020�� ����
	default void bcd() {
		System.out.println("A �������̽��� bcd()");
	}
}
//#1. �߻�޼��常 ����
class B implements A{
	@Override
	public void abc() {
		System.out.println("B Ŭ������ abc()");
	}
}
//#2. �߻�޼��� ���� + ����Ʈ �޼��� �������̵�
class C implements A {
	@Override
	public void abc() {
		System.out.println("B Ŭ������ abc()");
	}
	public void bcd() {
		System.out.println("C Ŭ������ bcd()");
	};
}

public class EX08_DefaultMethod_1 {
	public static void main(String[] args) {
		//#1. B ��ü ���� �� �޼��� ȣ��
		B b = new B();
		b.abc();	//B Ŭ������ abc()
		b.bcd();	//A �������̽��� bcd()
		
		//#2. C ��ü ���� �� �޼��� ȣ��
		C c = new C();
		c.abc();	//B Ŭ������ abc()
		c.bcd();	//C Ŭ������ bcd()
	}

}
