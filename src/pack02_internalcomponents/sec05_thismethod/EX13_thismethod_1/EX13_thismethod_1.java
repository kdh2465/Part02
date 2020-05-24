package pack02_internalcomponents.sec05_thismethod.EX13_thismethod_1;

class A{

	A(){
		System.out.println("첫번째 생성자");
	}
	A(int a){
		this(); //반드시 첫 줄에 위치
		System.out.println("두번째 생성자");
	}
}

public class EX13_thismethod_1 {
	public static void main(String[] args) {
		
		//# 두가지 객체 생성 방법
		A a1 = new A(); 	//첫번째 생성자
		A a2 = new A(3); 	//첫번째 생성자 - 두번째 생성자
		
	}
}
