package pack07_innerclassandinterface.sec04_anonymousclass.EX06_anonymousclass_1;

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
	      System.out.println("�ν��Ͻ� �̳�Ŭ����");  
	    }		
	}
}


public class EX06_anonymousclass_1 {
	public static void main(String[] args) {
		//��ü ����
		A a = new A();
		a.abc();
	}
}
