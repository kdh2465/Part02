package pack06_modifier_2.sec01_finalmodifier.EX02_finalmodifier_2;

/*final 메서드와 final 클래스의 특징*/

class A {
	void abc() {}
	final void bcd() {}
}

class B extends A {
	@Override
	void abc() {}
	//void bcd() {} //(불가능)
}

final class C{}
//class D extends C{} //(불가능)

public class EX02_finalmodifier_2 {
	public static void main(String[] args) {
				
	}
}
