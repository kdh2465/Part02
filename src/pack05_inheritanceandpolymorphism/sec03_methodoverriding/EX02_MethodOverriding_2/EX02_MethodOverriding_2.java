package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX02_MethodOverriding_2;

/*메서드 오버라이딩의 대표적 예시*/

class Animal {
	void cry() {
		
	}
}

class Bird extends Animal {
	void cry() {
		System.out.println("짹짹");		
	}
}
class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");		
	}
}
class Cat extends Animal {
	void cry() {
		System.out.println("야옹");		
	}
}

public class EX02_MethodOverriding_2 {
	public static void main(String[] args) {
		
		//#1. 각각의 타입으로 선언 + 각각의 타입으로 객체 생성
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry(); //출력없음
		bb.cry(); //짹짹
		cc.cry(); //야옹
		dd.cry(); //멍멍
		
		//#2. Animal 타입으로 선언 + 자식클래스 타입으로 객체 생성 (다형적 표현)
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry(); //짹짹
		ac.cry(); //야옹
		ad.cry(); //멍멍
		
		//#3. 배열로 관리
		Animal[] animals = new Animal[] {new Bird(), new Cat(), new Dog()};
		for(Animal animal : animals) {
			animal.cry(); 
		} //짹짹, 야옹, 멍멍
					
	}

}
