package pack07_innerclassandinterface.sec04_anonymousclass.EX07_anonymousclass_2;

interface C {
	public abstract void bcd();
}

class A {

	C b = new C() {
		public void bcd(){
		      System.out.println("�͸� �̳�Ŭ����");  
		}
	};

	void abc() {
		b.bcd();
	}
}

public class EX07_anonymousclass_2 {
	public static void main(String[] args) {
		//��ü ����
		A a = new A();
		a.abc();
	}
}
