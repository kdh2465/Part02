package pack05_inheritanceandpolymorphism.sec07_modifier_2.EX21_finalmodifier_2;

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

public class EX21_finalmodifier_2 {
	public static void main(String[] args) {
		
		
	}
}
