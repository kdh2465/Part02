package pack08_innerclassandinterface.sec03_localclass.EX01_AccessMemberAndLocalVariable;

/*지역이너클래스 내부에서 외부 멤버 및 메서드 지역변수 활용*/

class A{
	int a=3;
	void abc() {
		int b=5;
		
		class B{
			void bcd() {				
				System.out.println(a); //필드 (O)
				System.out.println(b); //지역변수 (O)
				a=7;
				//b=7; //(불가능)
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
