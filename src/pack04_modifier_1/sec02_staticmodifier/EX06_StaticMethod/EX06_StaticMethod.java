package pack04_modifier_1.sec02_staticmodifier.EX06_StaticMethod;

/*�ν��Ͻ� �޼���� ���� �޼���*/

class A{
	void abc(){ //�ν��Ͻ� �޼���
		System.out.println("�ν��Ͻ� �޼���");
	}

	static void bcd(){ //static �޼���
		System.out.println("static �޼���");
	}
}

public class EX06_StaticMethod {
	public static void main(String[] args) {
	
		//#1. �ν��Ͻ� �޼��� Ȱ�� ��� (1.��ü ����  2.�޼��� ȣ��)
		A a = new A();
		a.abc(); //�ν��Ͻ� �޼���
		
		//#2. static �޼��� Ȱ�� ��� 
		//@��� #1 (1.Ŭ�����̸����� �ٷ� ����)
		A.bcd(); 	//static �޼���
		//@��� #2 (1.��ü ����  2.�޼��� ȣ��)
		A a2 = new A(); 
		a2.bcd(); 	//static �޼���
		
	}
}
