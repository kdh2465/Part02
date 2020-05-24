package pack07_innerclassandinterface.sec04_anonymousclass.EX07_anonymousclass_2;

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

public class EX07_anonymousclass_2 {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		a.abc();
	}
}
