package pack02_internalcomponents.sec01_field.EX02_initialValueOfFieldAndLocalVariable;

//#1. 클래스 생성
class A {
	boolean m1;	
	int m2;	
	double m3;	
	String m4;
	
	void printFieldValues() {
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
	}
	
	void printLocalVariable() {
		int k;
		//System.out.println(k); //오류
	}
	
}

public class EX02_initialValueOfFieldAndLocalVariable {
	
	public static void main(String[] args) {
		
		//#2. 클래스를 활용하여 객체 생성
		A a = new A();
		
		//#3. 필드값 출력
		a.printFieldValues();
	}

}
