
package pack02_internalcomponents.sec02_method.EX06_methodOverloading;

/*메서드의 오버로딩(Overloading)*/

public class EX06_methodOverloading {
	public static void main(String[] args) {
		
		print();
		print(3);
		print(5.8);
		print(2, 5);
				
	}
	
	public static void print(){
		System.out.println("데이터가 없습니다");
	}
	public static void print(int a){
		System.out.println(a);
	}
	public static void print(double a){
		System.out.println(a);
	}
	public static void print(int a, int b){
		System.out.println(a + ", "+b);
	}	
//	public static int print(int a, int b){
//		return a+b;
//	} //오버로드 불가
			
}
