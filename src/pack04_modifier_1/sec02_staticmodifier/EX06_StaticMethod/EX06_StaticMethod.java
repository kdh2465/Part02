package pack04_modifier_1.sec02_staticmodifier.EX06_StaticMethod;

/*인스턴스 메서드와 정적 메서드*/

class A{
	void abc(){ //인스턴스 메서드
		System.out.println("인스턴스 메서드");
	}

	static void bcd(){ //static 메서드
		System.out.println("static 메서드");
	}
}

public class EX06_StaticMethod {
	public static void main(String[] args) {
	
		//#1. 인스턴스 메서드 활용 방법 (1.객체 생성  2.메서드 호출)
		A a = new A();
		a.abc(); //인스턴스 메서드
		
		//#2. static 메서드 활용 방법 
		//@방법 #1 (1.클래스이름으로 바로 접근)
		A.bcd(); 	//static 메서드
		//@방법 #2 (1.객체 생성  2.메서드 호출)
		A a2 = new A(); 
		a2.bcd(); 	//static 메서드
		
	}
}
