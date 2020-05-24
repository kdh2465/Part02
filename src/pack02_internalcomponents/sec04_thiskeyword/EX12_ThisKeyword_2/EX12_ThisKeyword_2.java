package pack02_internalcomponents.sec04_thiskeyword.EX12_ThisKeyword_2;

class A {
	int m;
	int n;
	void init(int m, int n){
		m=m;  
		n=n; 
	}	
}
class B {
	int m;
	int n;
	void init(int m, int n){
		this.m=m;  
		this.n=n; 
	}	
}

public class EX12_ThisKeyword_2 {
	public static void main(String[] args) {
		
		//#1. �ʵ��� �������� �̸��� ���� ��� (this �̻��)
		A a = new A();		
		a.init(2,3); 
		System.out.println(a.m);	//0		
		System.out.println(a.n);	//0
		
		//#2. �ʵ��� �������� �̸��� ���� ��� (this ���)
		B b = new B();		
		b.init(2,3); 
		System.out.println(b.m);	//2		
		System.out.println(b.n);	//3
		
	}
}
