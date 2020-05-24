package pack02_internalcomponents.sec03_constructor.EX10_ConstructorOverloading;

class A {
	int m;
	void work() {
		System.out.println(m);
	}
	//기본생성자 자동 추가 A(){}
}

class B{	
	int m;
	void work() {
		System.out.println(m);
	}
	B(){ //기본생성자
		
	}
}

class C{
	int m;
	void work() {
		System.out.println(m);
	}
	C(int a){ //기본생성자
		m=a;
	}
}

public class EX10_ConstructorOverloading {
	public static void main(String[] args) {
		
		//#1. 기본생성자를 이용한 객체 생성
		A a = new A();
		B b = new B();
		//C c = new C(); //오류 (기본생성자 없음)
		C c = new C(3);
		
		//#2. 메서드 호출
		a.work();	//0
		b.work();	//0
		c.work();	//3
	}
}
