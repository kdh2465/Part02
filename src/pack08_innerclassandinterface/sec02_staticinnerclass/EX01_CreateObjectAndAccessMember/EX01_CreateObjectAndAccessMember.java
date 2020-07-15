package pack08_innerclassandinterface.sec02_staticinnerclass.EX01_CreateObjectAndAccessMember;

/*�����̳�Ŭ���������� �ܺθ�� ��� �� ��ü ����*/

class A{
	int a=3;
	static int b=4;
	void method1() {
		System.out.println("Instance Method");
	}
	static void method2() {
		System.out.println("Static Method");
	}
	
	static class B{
		void bcd() {
			//#1. outer Ŭ���� �ʵ� ���� 
			//System.out.println(a); //(�Ұ���)
			System.out.println(b);
			//#2. outer Ŭ���� �޼��� ����
			//method1(); //(�Ұ���)
			method2();			
		}
	}
}
public class EX01_CreateObjectAndAccessMember {
	public static void main(String[] args) {
		
		//#3. static inner class ��ü����
		A.B b = new A.B();
		b.bcd();		
		
	}
}
