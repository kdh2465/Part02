package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX04_AccessModifier;

/*�޼��� �������̵��� ����������*/

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
	//void abc() {}; //(�Ұ���)
}
class B4 extends A{
	//private void abc() {}; //(�Ұ���)	
}

public class EX04_AccessModifier {
	public static void main(String[] args) {		
	}
}