package pack01_createobjectandusageofmembers.EX01_createObjectAndUsageOfMembers;

/*Ŭ���� ������ ��ü�� ���� �� Ȱ��*/

//#1. Ŭ������ ����
class A {
	int m = 3;
	
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}	
}

public class EX01_createObjectAndUsageOfMembers {	
	public static void main(String[] args) {		
		//#2. Ŭ������ ���� ��ü�� ����
		A a = new A();
				
		//#3. Ŭ���� ����� Ȱ��
		//@ �ʵ��� �� �Է� �� ���
		a.m=5;
		System.out.println(a.m); //5
		//@ �޼����� Ȱ�� (ȣ��)
		a.print(); //��ü ���� �� Ȱ��
	}
}
