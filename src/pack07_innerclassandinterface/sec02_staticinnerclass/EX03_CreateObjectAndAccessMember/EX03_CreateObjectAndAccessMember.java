package pack07_innerclassandinterface.sec02_staticinnerclass.EX03_CreateObjectAndAccessMember;

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
			//#1. outer 클래스 필드 접근 
			//System.out.println(a); //(불가능)
			System.out.println(b);
			//#2. outer 클래스 메서드 접근
			//method1(); //(불가능)
			method2();			
		}
	}
}
public class EX03_CreateObjectAndAccessMember {
	public static void main(String[] args) {
		
		//#3. static inner class 객체생성
		A.B b = new A.B();
		b.bcd();		
		
	}
}
