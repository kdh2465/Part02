package pack02_internalcomponents.sec02_method.EX03_externalCallMethods;

/*Ŭ���� �ܺο����� �޼��� ȣ��*/

class A {
	//#. ����Ÿ��:void + �Ű�����: ����
	void print() {
		System.out.println("�ȳ�");
	}
	
	//#. ����Ÿ��: int + �Ű�����: ����
	int data() {
		return 3;
	}
	
	//#. ����Ÿ��: double + �Ű�����: 2��
	double sum (int a, double b) {
		return a+b;
	}
	
	//#. ����Ÿ��: void + �Ű����� : 1�� + ���� �Լ�����(return ����)
	void printMonth(int m) {
		if(m<0 || m>12) {
			System.out.println("�߸��� �Է�!");
			return;
		}
		System.out.println(m+"�� �Դϴ�.");			
	}	
}

public class EX03_externalCallMethods {
	public static void main(String[] args) {
	
		//�޼����� �ܺ� ȣ��(�ٸ� Ŭ������ �޼��� ȣ��) 1. ��ü ����  2.���������κ��� �޼��� ȣ��
		//#1. ��ü ����
		A a = new A();
		
		//#2. �޼��� �ܺ� ȣ�� (���������κ��� �޼��� ȣ��)
		a.print(); 				//"�ȳ�"
		int k = a.data();
		System.out.println(k);	//3
		
		double result = a.sum(3, 5.2);
		System.out.println(result);	//8.2
		
		a.printMonth(5); 	//5�� �Դϴ�.
		a.printMonth(15);	//�߸��� �Է�		
	}
}
