package pack04_modifier_1.sec02_staticmodifier.EX01_StaticField_1;

/*�ν��Ͻ� �ʵ�� �����ʵ��� Ȱ�� ���*/

public class EX01_StaticField_1 {
	public static void main(String[] args) {
	
		//#1. �ν��Ͻ� �ʵ� Ȱ�� ��� (1.��ü ����  2.�ʵ���)
		A a1 = new A();
		System.out.println(a1.m); 	//3
				
		//#2. static �ʵ� Ȱ�� ��� 
		//@��� #1 (1.Ŭ�����̸����� �ٷ� ����)
		System.out.println(A.n); 	//5
		//@��� #2 (1.��ü ����  2.�ʵ���)
		A a2 = new A();
		System.out.println(a2.n); 	//5
				
	}
}
