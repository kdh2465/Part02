package pack05_inheritanceandpolymorphism.sec02_typecasting.EX03_TypeCastingOfObject_1;

/*Ŭ������ ��ĳ���� �� �ٿ�ĳ����*/

class A{ }
class B extends A{ }
class C extends B{ }
class D extends B{ }

public class EX03_TypeCastingOfObject_1 {
	public static void main(String[] args) {

		//#1. ��ĳ���� (������ �ڵ��߰�)
		A ac = (A)new C(); //A ac = new C();		
		B bc = (B)new C(); //B bc = new C();
		
		B bb = new B();
		A a = (A)bb; //A a = b;
		
		//#2. �ٿ�ĳ���� (������ ����) : �Ұ����� ���
		A aa = new A();
		//B b = (B)aa; // ����
		//C c = (C)aa; // ����
		
		//#3. �ٿ�ĳ���� (������ ����) : ������ ���
		A ab = new B();
		B b = (B)ab; 
		
		B bd = new D();
		D d = (D)bd;
		
		A ad = new D();
		B b1 = (B)ad;
		D d1 = (D)ad;
		
	}
}
