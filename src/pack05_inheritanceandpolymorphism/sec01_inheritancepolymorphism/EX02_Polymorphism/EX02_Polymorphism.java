package pack05_inheritanceandpolymorphism.sec01_inheritancepolymorphism.EX02_Polymorphism;

/*상속을 통한 객체의 다형적 표현*/

class A{ }
class B extends A{ }
class C extends B{ }
class D extends B{ }

public class EX02_Polymorphism {
	public static void main(String[] args) {
		
		//# 다형적 표현
		A aa = new A();
		A ab = new B();
		A ac = new C();
		A ad = new D();
		
		//B ba = new A(); //오류
		B bb = new B();
		B bc = new C();
		B bd = new D();
				
		//C ca = new A(); //오류
		//C cb = new B(); //오류
		C cc = new C();
		//C cd = new D();	//오류
		
		//D da = new A(); //오류
		//D db = new B(); //오류
		//D dc = new C(); //오류
		D dd = new D();				
		
	}
}
