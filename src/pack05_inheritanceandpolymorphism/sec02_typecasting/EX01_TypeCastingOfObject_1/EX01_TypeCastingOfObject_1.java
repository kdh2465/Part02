package pack05_inheritanceandpolymorphism.sec02_typecasting.EX03_TypeCastingOfObject_1;

/*클래스의 업캐스팅 및 다운캐스팅*/

class A{ }
class B extends A{ }
class C extends B{ }
class D extends B{ }

public class EX03_TypeCastingOfObject_1 {
	public static void main(String[] args) {

		//#1. 업캐스팅 (생략시 자동추가)
		A ac = (A)new C(); //A ac = new C();		
		B bc = (B)new C(); //B bc = new C();
		
		B bb = new B();
		A a = (A)bb; //A a = b;
		
		//#2. 다운캐스팅 (수동만 가능) : 불가능한 경우
		A aa = new A();
		//B b = (B)aa; // 오류
		//C c = (C)aa; // 오류
		
		//#3. 다운캐스팅 (수동만 가능) : 가능한 경우
		A ab = new B();
		B b = (B)ab; 
		
		B bd = new D();
		D d = (D)bd;
		
		A ad = new D();
		B b1 = (B)ad;
		D d1 = (D)ad;
		
	}
}
