package pack02_internalcomponents.sec01_field.EX01_fieldComponent;

/*Ŭ���� �ܺο��� ���������� ����� �ʵ�� �޼��� ȣ��*/

//#1. Ŭ���� ����
class A {
	int m=3; // �ʵ�
	int n=4; // �ʵ�
	
	void work1() {
		int k=5; //��������
		System.out.println(k);
	}
	void work2(int i) { //��������
		int j=4; //��������
		System.out.println(i+j);
	}
}

public class EX01_fieldComponent {
	
	public static void main(String[] args) {
		
		//#2. Ŭ������ Ȱ���Ͽ� ��ü ����
		A a = new A();
		
		//#3. �ʵ尪 ���
		System.out.println("�ʵ� m = "+a.m); //3
		System.out.println("�ʵ� n = "+a.n); //4
		
		//#4. �޼��� ȣ��
		a.work1(); //ȣ��� �������� k ���� / �޼��� ���� �� ����
		a.work2(3);//ȣ��� �������� i ���� / �޼��� ���� �� ����
	}
	
}
