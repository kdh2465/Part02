package pack02_internalcomponents.sec02_method.EX04_internalCallMethods;

/*Ŭ���� ���ο����� �޼��� ȣ��*/

public class EX04_internalCallMethods {
	public static void main(String[] args) {
	
		//�޼����� ���� ȣ�� 1. �޼��� �̸����� �ٷ� ȣ����￪ 3ȣ��
		print();

		int a = twice(3);
		System.out.println(a);

		double b = sum(a, 5.8);
		System.out.println(b);	
	}
	
	public static void print(){
		System.out.println("�ȳ�");
	}
		
	public static int twice(int k){
		return k*2;
	}

	public static double sum(int m, double n){
		return m+n;
	}	
}
