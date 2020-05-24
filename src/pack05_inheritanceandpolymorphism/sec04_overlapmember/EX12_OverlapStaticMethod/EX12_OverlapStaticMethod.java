package pack05_inheritanceandpolymorphism.sec04_overlapmember.EX12_OverlapStaticMethod;


class A{
	static void print() {
		System.out.println("A Ŭ����");	
	}
}
class B extends A{
	static void print() {
		System.out.println("B Ŭ����");	
	}
}

public class EX12_OverlapStaticMethod {
	public static void main(String[] args) {
		
		//#1. Ŭ���� �̸����� �ٷ� ����
		A.print(); //A Ŭ����
		B.print(); //B Ŭ����
		
		//#2. ��ü ����
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//#3. ��ü ������ ���� static �޼���
		aa.print(); //A Ŭ����
		bb.print(); //B Ŭ����
		ab.print(); //A Ŭ����
		
	}
}
