package pack07_abstractclassandinterface.sec02_interface.EX03_InheritanceOfInterface_2;

/*�������̽� ��� �ڽ�Ŭ������ ����������*/

interface A {	
	public abstract void abc();	
}

interface B {	
	void bcd();	//public abstract �ڵ� �߰�
}

class C implements A {
	@Override
	public void abc() {
		// ...		
	}
}
/* overriding�� ������������ ������ ������ �� ����
class D implements B {
	@Override
	void bcd() { // (�Ұ���) 
		// ...		
	}
}
*/

public class EX03_InheritanceOfInterface_2 {
	public static void main(String[] args) {
		
	}
}
