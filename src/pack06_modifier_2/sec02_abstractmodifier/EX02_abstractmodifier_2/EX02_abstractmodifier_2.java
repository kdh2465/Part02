package pack06_modifier_2.sec02_abstractmodifier.EX02_abstractmodifier_2;

/*추상클래스를 상속하여 오버라이딩 수행*/

abstract class Animal{
	abstract void cry();
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}	
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}	
}

public class EX02_abstractmodifier_2 {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		animal1.cry(); //야옹
		
		Animal animal2 = new Dog();
		animal2.cry(); //멍멍
	}

}
