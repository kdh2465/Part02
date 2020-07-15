package pack02_internalcomponents.sec04_thiskeyword.EX01_ThisKeyword_1;

/*묵시적 this 키워드 자동 추가 */

class A {
	int m;
	int n;

	void init(int a, int b){
		int c=3;
		m=a; //this.m=a
		n=b; //this.n=b
	}
	void work(){
		init(2, 3); //this.init(2,3)
	}
}

public class EX01_ThisKeyword_1 {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		A a = new A();
		
		//#2. 메서드호출 및 필드값 출력
		a.work(); 
		System.out.println(a.m);	//2
		System.out.println(a.n);	//3
		
	}
}
