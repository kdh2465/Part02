package pack07_innerclassandinterface.sec03_localclass.EX04_AccessMemberAndLocalVariable;

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
public class EX04_AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
