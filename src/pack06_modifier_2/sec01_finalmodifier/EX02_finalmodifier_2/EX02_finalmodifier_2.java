package pack06_modifier_2.sec01_finalmodifier.EX02_finalmodifier_2;

/*final �޼���� final Ŭ������ Ư¡*/

class A {
	void abc() {}
	final void bcd() {}
}

class B extends A {
	@Override
	void abc() {}
	//void bcd() {} //(�Ұ���)
}

final class C{}
//class D extends C{} //(�Ұ���)

public class EX02_finalmodifier_2 {
	public static void main(String[] args) {
		
		
	}
}
