package pack08_innerclassandinterface.sec04_anonymousclass.EX01_anonymousclass_1;

/*�������̽��� ����� �̳�Ŭ������ �����Ͽ� �������̽� ��ü ����*/

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


public class EX01_anonymousclass_1 {
	public static void main(String[] args) {
		//��ü ����
		A a = new A();
		a.abc();
	}
}
