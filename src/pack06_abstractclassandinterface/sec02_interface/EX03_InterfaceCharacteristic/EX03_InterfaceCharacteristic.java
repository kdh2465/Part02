package pack06_abstractclassandinterface.sec02_interface.EX03_InterfaceCharacteristic;

interface A {
	public static final int a=3;
	public abstract void abc();	
}

interface B {
	int b=3;  	//public static final 자동 추가
	void bcd();	//public abstract 자동 추가
}

public class EX03_InterfaceCharacteristic {
	public static void main(String[] args) {
		
		//#1. 필드의 static 특징 확인 (클래스/인터페이스 이름으로 바로 접근 가능)
		System.out.println(A.a);
		System.out.println(B.b);
		
		//#2. 필드의 final 특징 확인 (값 변경 불가)
		//A.a=4; //(불가능)
		//B.b=4; //(불가능)
				
	}
}
 