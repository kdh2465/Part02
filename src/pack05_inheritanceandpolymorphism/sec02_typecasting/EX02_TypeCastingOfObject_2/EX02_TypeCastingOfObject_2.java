package pack05_inheritanceandpolymorphism.sec02_typecasting.EX02_TypeCastingOfObject_2;

/*선언타입에 따른 사용가능한 멤버*/

class A {
	int m=3;
	void abc(){
		System.out.println("A 클래스");
	}
}

class B extends A{
	int n=4;
	void bcd(){
		System.out.println("B 클래스");
	}
}

public class EX02_TypeCastingOfObject_2 {
	public static void main(String[] args) {
		
		//#1. A 타입 + A 객체 : 필드 1개 + 메서드 1개
		A aa = new A(); 
		System.out.println(aa.m);
		aa.abc();//E 클래스
		
		//#2. B 타입 + B 객체 : 필드 2개 + 메서드2개
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		//#3. A 타입 + B 객체 : 필드 1개 + 메서드 1개 (타입내의 멤버만 사용 가능)
		A ab = new B();
		System.out.println(ab.m);
		//System.out.println(ab.n); //X
		ab.abc();
		//ab.bcd(); //X
				
	}
}
