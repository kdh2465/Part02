package pack08_innerclassandinterface.sec04_anonymousclass.EX04_anonymousclass_4;

/*클래스 미정의 및 참조변수명을 사용/미사용의 경우 매개변수 객체 전달*/

interface A {
	public abstract void abc();
}

class B implements A {
	public void abc(){
		System.out.println("매개변수 전달");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class EX04_anonymousclass_4 {
	public static void main(String[] args) {
		
		C c = new C();
		
		//#1. 방법 3. 클래스명 X + 참조변수명 O		
		A a = new A() {
			public void abc() {
				System.out.println("매개변수 전달");
			};
		};
		c.cde(a);
		
		//#2. 방법 4. 클래스명 X + 참조변수명 X
		c.cde(new A() {
			public void abc() {
				System.out.println("매개변수 전달");
			};
		});
		
	}	
}
