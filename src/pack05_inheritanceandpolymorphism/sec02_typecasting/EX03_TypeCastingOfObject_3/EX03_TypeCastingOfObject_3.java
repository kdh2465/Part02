package pack05_inheritanceandpolymorphism.sec02_typecasting.EX03_TypeCastingOfObject_3;

/*ĳ������ ���ɿ��θ� Ȯ���� �� �ִ� instanceof*/

class A{}
class B extends A{}

public class EX03_TypeCastingOfObject_3 {
	public static void main(String[] args) {
		
		//#1. instanceof		
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A); //true
		System.out.println(aa instanceof B); //false
		
		System.out.println(ab instanceof A); //true
		System.out.println(ab instanceof B); //true
		
		if(aa instanceof B) {			
			B b = (B)aa;
			System.out.println("aa�� B�� casting�� �Ϸ��Ͽ����ϴ�.");
		} else {
			System.out.println("aa�� B�� casting�� �� �� �����ϴ�.");
		}
		
		if(ab instanceof B) {			
			B b = (B)ab;
			System.out.println("ab�� B�� casting�� �Ϸ��Ͽ����ϴ�.");
		} else {
			System.out.println("ab�� B�� casting�� �� �� �����ϴ�.");
		}
		
		if("�ȳ�" instanceof String) {
			System.out.println("\"�ȳ�\"�� String �Դϴ�.");
		}				
	}
}
