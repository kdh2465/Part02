package pack06_abstractclassandinterface.sec02_interface.EX05_InheritanceOfInterface_2;

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

public class EX05_InheritanceOfInterface_2 {

}
