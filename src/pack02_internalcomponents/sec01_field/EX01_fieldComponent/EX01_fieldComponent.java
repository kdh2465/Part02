package pack02_internalcomponents.sec01_field.EX01_fieldComponent;

/*클래스 외부에서 참조변수를 사용한 필드와 메서드 호출*/

//#1. 클래스 생성
class A {
	int m=3; // 필드
	int n=4; // 필드
	
	void work1() {
		int k=5; //지역변수
		System.out.println(k);
		work2(3); //호출시 지역변수 i 생성 / 메서드 종료 후 삭제
	}
	void work2(int i) { //지역변수
		int j=4; //지역변수
		System.out.println(i+j);
	}
}

public class EX01_fieldComponent {
	
	public static void main(String[] args) {
		
		//#2. 클래스를 활용하여 객체 생성
		A a = new A();
		
		//#3. 필드값 출력
		System.out.println("필드 m = "+a.m); //3
		System.out.println("필드 n = "+a.n); //4
		
		//#4. 메서드 호출
		a.work1(); //호출시 지역변수 k 생성 / 메서드 종료 후 삭제		
	}
	
}
