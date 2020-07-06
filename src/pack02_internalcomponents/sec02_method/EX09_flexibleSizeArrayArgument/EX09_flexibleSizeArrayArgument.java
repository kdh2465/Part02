package pack02_internalcomponents.sec02_method.EX09_flexibleSizeArrayArgument;

/*메서드의 가변길이 배열 매개변수*/

public class EX09_flexibleSizeArrayArgument {
	public static void main(String[] args) {
		//#1. 길이가 정해져 있지 않은 int배열 매개변수
		method1(1,2); //매개변수길이:2 --> 1,2
		method1(1,2,3); //매개변수길이:3 --> 1,2,3
		method1(); //매개변수길이:0 --> X
		
		//#2. 길이가 정해져 있지 않은 String배열 매개변수
		method2("안녕","방가"); //매개변수길이:2 --> "안녕","방가"
		method2("땡큐","베리","감사"); //매개변수길이:3 --> "땡큐","베리","감사"
		method2(); //매개변수길이:0 --> X
		
	}
	public static void method1(int... values) {
		System.out.println("매개변수 길이 : "+values.length);
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
//		for(int k: values) {
//			System.out.println(k);
//		}
	}
	public static void method2(String...values) {
		System.out.println("매개변수 길이 : "+values.length);
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
//		for(String k: values) {
//			System.out.println(k);
//		}
	}
}
