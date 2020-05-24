package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX07_MethodOverriding_2;

class Animal {
	void cry() {
		
	}
}

class Bird extends Animal {
	void cry() {
		System.out.println("Â±Â±");		
	}
}
class Dog extends Animal {
	void cry() {
		System.out.println("¸Û¸Û");		
	}
}
class Cat extends Animal {
	void cry() {
		System.out.println("¾ß¿Ë");		
	}
}

public class EX07_MethodOverriding_2 {
	public static void main(String[] args) {
		
		//#1. °¢°¢ÀÇ Å¸ÀÔÀ¸·Î ¼±¾ð + °¢°¢ÀÇ Å¸ÀÔÀ¸·Î °´Ã¼ »ý¼º
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry(); //Ãâ·Â¾øÀ½
		bb.cry(); //Â±Â±
		cc.cry(); //¾ß¿Ë
		dd.cry(); //¸Û¸Û
		
		//#2. Animal Å¸ÀÔÀ¸·Î ¼±¾ð + ÀÚ½ÄÅ¬·¡½º Å¸ÀÔÀ¸·Î °´Ã¼ »ý¼º (´ÙÇüÀû Ç¥Çö)
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry(); //Â±Â±
		ac.cry(); //¾ß¿Ë
		ad.cry(); //¸Û¸Û
		
		//#3. ¹è¿­·Î °ü¸®
		Animal[] animals = new Animal[] {new Bird(), new Cat(), new Dog()};
		for(Animal animal : animals) {
			animal.cry(); 
		} //Â±Â±, ¾ß¿Ë, ¸Û¸Û
					
	}

}
