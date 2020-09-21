package pack05_inheritanceandpolymorphism.sec05_superkeywordandsupermethod.EX04_supermethod_2;

/*this()메서드와 super() 메서드의 혼용*/

class A {
	A() {
		this(3);
		System.out.println("A 생성자1");
	}
	A(int a) {
		System.out.println("A 생성자2");
	}
}

class B extends A {
	B() {
		this(3);
		System.out.println("B 생성자1");
	}
	B(int a) {
		System.out.println("B 생성자2");
	}
}

public class EX04_supermethod_2 {
	public static void main(String[] args) {
		
		//#1. A 객체 생성
		A aa1 = new A(); 	// A 생성자2 -> A 생성자1 
		A aa2 = new A(2); 	// A 생성자2
		System.out.println();
		
		//#2. B 객체 생성
		B bb1 = new B();	// A 생성자2 -> A 생성자1 -> B 생성자2 -> B 생성자1
		B bb2 = new B(2);	// A 생성자2 -> A 생성자1 -> B 생성자2

	}
}


