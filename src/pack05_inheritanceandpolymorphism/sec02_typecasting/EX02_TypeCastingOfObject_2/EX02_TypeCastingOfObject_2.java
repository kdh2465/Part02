package pack05_inheritanceandpolymorphism.sec02_typecasting.EX02_TypeCastingOfObject_2;

/*����Ÿ�Կ� ���� ��밡���� ���*/

class A {
	int m=3;
	void abc(){
		System.out.println("A Ŭ����");
	}
}

class B extends A{
	int n=4;
	void bcd(){
		System.out.println("B Ŭ����");
	}
}

public class EX02_TypeCastingOfObject_2 {
	public static void main(String[] args) {
		
		//#1. A Ÿ�� + A ��ü : �ʵ� 1�� + �޼��� 1��
		A aa = new A(); 
		System.out.println(aa.m);
		aa.abc();//E Ŭ����
		
		//#2. B Ÿ�� + B ��ü : �ʵ� 2�� + �޼���2��
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		//#3. A Ÿ�� + B ��ü : �ʵ� 1�� + �޼��� 1�� (Ÿ�Գ��� ����� ��� ����)
		A ab = new B();
		System.out.println(ab.m);
		//System.out.println(ab.n); //X
		ab.abc();
		//ab.bcd(); //X
				
	}
}
