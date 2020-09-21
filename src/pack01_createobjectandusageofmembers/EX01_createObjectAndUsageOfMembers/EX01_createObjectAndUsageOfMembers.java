package pack01_createobjectandusageofmembers.EX01_createObjectAndUsageOfMembers;

/*클래스 구성과 객체의 생성 및 활용*/

//#1. 클래스의 구성
class A {
	int m = 3;
	
	void print() {
		System.out.println("객체 생성 및 활용");
	}	
}

public class EX01_createObjectAndUsageOfMembers {	
	public static void main(String[] args) {		
		//#2. 클래스로 부터 객체의 생성
		A a = new A();
				
		//#3. 클래스 멤버의 활용
		//@ 필드의 값 입력 및 출력
		a.m=5;
		System.out.println(a.m); //5
		//@ 메서드의 활용 (호출)
		a.print(); //객체 생성 및 활용
	}
}
