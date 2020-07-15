package pack08_innerclassandinterface.sec04_anonymousclass.EX02_anonymousclass_2;

/*익명이너클래스를 활용하여 인터페이스 객체 생성*/

interface C {
	public abstract void bcd();
}

class A {

	C b = new C() {
		public void bcd(){
		      System.out.println("익명 이너클래스");  
		}
	};

	void abc() {
		b.bcd();
	}
}

public class EX02_anonymousclass_2 {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		a.abc();
	}
}
