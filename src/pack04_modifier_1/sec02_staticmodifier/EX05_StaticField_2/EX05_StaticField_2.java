package pack04_modifier_1.sec02_staticmodifier.EX05_StaticField_2;

/*�����ʵ��� �������*/

public class EX05_StaticField_2 {
	public static void main(String[] args) {
	
		A a1 = new A();
		A a2 = new A();

		a1.m=5;	//�ν��Ͻ� �ʵ�
		a2.m=6;	//�ν��Ͻ� �ʵ�

		System.out.println(a1.m); //5
		System.out.println(a2.m); //6
		
		//# static �ʵ��� ����
		a1.n=7; //static �ʵ� 
		a2.n=8; //static �ʵ� 

		System.out.println(a1.n); //8
		System.out.println(a2.n); //8

		A.n=9;
		System.out.println(a1.n); //9
		System.out.println(a2.n); //9
						
	}
}
