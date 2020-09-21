package pack02_internalcomponents.sec02_method.EX02_internalCallMethods;

/*클래스 내부에서의 메서드 호출*/

public class EX02_internalCallMethods {
	public static void main(String[] args) {
	
		//메서드의 내부 호출 1. 메서드 이름으로 바로 호출원흥역 3호선
		print();

		int a = twice(3);
		System.out.println(a);

		double b = sum(a, 5.8);
		System.out.println(b);	
	}
	
	public static void print(){
		System.out.println("안녕");
	}
		
	public static int twice(int k){
		return k*2;
	}

	public static double sum(int m, double n){
		return m+n;
	}	
}
