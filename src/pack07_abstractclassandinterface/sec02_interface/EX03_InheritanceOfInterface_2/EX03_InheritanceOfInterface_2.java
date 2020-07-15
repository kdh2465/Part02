package pack07_abstractclassandinterface.sec02_interface.EX03_InheritanceOfInterface_2;

/*인터페이스 상속 자식클래스의 접근지정자*/

interface A {	
	public abstract void abc();	
}

interface B {	
	void bcd();	//public abstract 자동 추가
}

class C implements A {
	@Override
	public void abc() {
		// ...		
	}
}
/* overriding시 접근지정자의 범위는 좁아질 수 없음
class D implements B {
	@Override
	void bcd() { // (불가능) 
		// ...		
	}
}
*/

public class EX03_InheritanceOfInterface_2 {
	public static void main(String[] args) {
		
	}
}
