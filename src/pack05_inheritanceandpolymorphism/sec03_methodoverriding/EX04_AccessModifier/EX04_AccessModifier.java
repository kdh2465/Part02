﻿package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX04_AccessModifier;

/*메서드 오버라이딩과 접근지정자*/

class A{
	protected void abc() {};	
}

class B1 extends A{
	public void abc() {};	
}
class B2 extends A{
	protected void abc() {};	
}
class B3 extends A{
	//void abc() {}; //(불가능)
}
class B4 extends A{
	//private void abc() {}; //(불가능)	
}

public class EX04_AccessModifier {
	public static void main(String[] args) {		
	}
}
