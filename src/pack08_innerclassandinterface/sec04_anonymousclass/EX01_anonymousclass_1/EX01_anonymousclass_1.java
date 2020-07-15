package pack08_innerclassandinterface.sec04_anonymousclass.EX01_anonymousclass_1;

/*인터페이스를 상속한 이너클래스를 생성하여 인터페이스 객체 생성*/

interface C {
	public abstract void bcd();
}

class A {

	C b = new B();

	void abc() {
		b.bcd();
	}

	class B implements C {
		public void bcd(){
	      System.out.println("인스턴스 이너클래스");  
	    }		
	}
}


public class EX01_anonymousclass_1 {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		a.abc();
	}
}
