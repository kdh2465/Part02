package pack08_innerclassandinterface.sec03_localclass.EX01_AccessMemberAndLocalVariable;

/*�����̳�Ŭ���� ���ο��� �ܺ� ��� �� �޼��� �������� Ȱ��*/

class A{
	int a=3;
	void abc() {
		int b=5;
		
		class B{
			void bcd() {				
				System.out.println(a); //�ʵ� (O)
				System.out.println(b); //�������� (O)
				a=7;
				//b=7; //(�Ұ���)
			}
		}
		B bb = new B();
		bb.bcd();
	}
}
public class EX01_AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
