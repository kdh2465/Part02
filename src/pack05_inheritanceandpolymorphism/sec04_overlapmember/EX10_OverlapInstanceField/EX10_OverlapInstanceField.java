package pack05_inheritanceandpolymorphism.sec04_overlapmember.EX10_OverlapInstanceField;

class A{
	int m = 3;	
}
class B extends A{
	int m = 4;
}

public class EX10_OverlapInstanceField {
	public static void main(String[] args) {
		
		//#1. ��ü ����
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//#2. �ν��Ͻ� �ʵ� 
		System.out.println(aa.m); //3
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3
		
	}
}
