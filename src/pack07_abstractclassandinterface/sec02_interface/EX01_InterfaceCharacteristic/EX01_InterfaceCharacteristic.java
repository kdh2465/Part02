package pack07_abstractclassandinterface.sec02_interface.EX01_InterfaceCharacteristic;

/*�������̽��� �ʵ� �� �޼����� ������*/

interface A {
	public static final int a=3;
	public abstract void abc();	
}

interface B {
	int b=3;  	//public static final �ڵ� �߰�
	void bcd();	//public abstract �ڵ� �߰�
}

public class EX01_InterfaceCharacteristic {
	public static void main(String[] args) {
		
		//#1. �ʵ��� static Ư¡ Ȯ�� (Ŭ����/�������̽� �̸����� �ٷ� ���� ����)
		System.out.println(A.a);
		System.out.println(B.b);
		
		//#2. �ʵ��� final Ư¡ Ȯ�� (�� ���� �Ұ�)
		//A.a=4; //(�Ұ���)
		//B.b=4; //(�Ұ���)
				
	}
}
 