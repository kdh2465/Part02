package pack06_modifier_2.sec01_finalmodifier.EX01_finalmodifier_1;

/*final 필드와 final 지역변수의 특징 */

class A1 {	
	int a = 3; 
	final int b = 5;
	A1(){

	}
}

class A2 {	
	int a; 
	final int b;
	A2(){
		a=3;
		b=5;
	}
}

class A3 {	
	int a = 3; 
	final int b = 5;
	A3(){
		a=5;
		//b=7; //(불가능)
	}
}

class B {
	void bcd() {
		int a=3;
		final int b=5;
		a=7;
		//b=9; //(불가능)
	}
}

public class EX01_finalmodifier_1 {
	public static void main(String[] args) {
		
		A1 a1 = new A1();
		a1.a = 7;
		//a1.b = 9; //(불가능)
		
		A2 a2 = new A2();
		a2.a = 7;
		//a2.b = 9; //(불가능)
		
	}
}
