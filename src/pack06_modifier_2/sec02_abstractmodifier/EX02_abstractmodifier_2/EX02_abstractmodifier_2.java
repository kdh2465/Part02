package pack06_modifier_2.sec02_abstractmodifier.EX02_abstractmodifier_2;

/*眠惑努贰胶甫 惑加窍咯 坷滚扼捞爹 荐青*/

abstract class Animal{
	abstract void cry();
}
class Cat extends Animal{
	void cry() {
		System.out.println("具克");
	}	
}
class Dog extends Animal{
	void cry() {
		System.out.println("港港");
	}	
}

public class EX02_abstractmodifier_2 {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		animal1.cry(); //具克
		
		Animal animal2 = new Dog();
		animal2.cry(); //港港
	}

}
