package pack02_internalcomponents.sec02_method.EX01_externalCallMethods;

/*클래스 외부에서의 메서드 호출*/

class A {
	//#. 리턴타입:void + 매개변수: 없음
	void print() {
		System.out.println("안녕");
	}
	
	//#. 리턴타입: int + 매개변수: 없음
	int data() {
		return 3;
	}
	
	//#. 리턴타입: double + 매개변수: 2개
	double sum (int a, double b) {
		return a+b;
	}
	
	//#. 리턴타입: void + 매개변수 : 1개 + 내부 함수종료(return 포함)
	void printMonth(int m) {
		if(m<0 || m>12) {
			System.out.println("잘못된 입력!");
			return;
		}
		System.out.println(m+"월 입니다.");			
	}	
}

public class EX01_externalCallMethods {
	public static void main(String[] args) {
	
		//메서드의 외부 호출(다른 클래스의 메서드 호출) 1. 객체 생성  2.참조변수로부터 메서드 호출
		//#1. 객체 생성
		A a = new A();
		
		//#2. 메서드 외부 호출 (참조변수로부터 메서드 호출)
		a.print(); 				//"안녕"
		int k = a.data();
		System.out.println(k);	//3
		
		double result = a.sum(3, 5.2);
		System.out.println(result);	//8.2
		
		a.printMonth(5); 	//5월 입니다.
		a.printMonth(15);	//잘못된 입력		
	}
}
