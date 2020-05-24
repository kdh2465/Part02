package pack05_inheritanceandpolymorphism.sec07_modifier_2.EX22_abstractmodifier_1;

class Animal{
	void cry() {
		
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}	
}
class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}	
}

public class EX22_abstractmodifier_1 {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		animal1.cry(); //�߿�
		
		Animal animal2 = new Dog();
		animal2.cry(); //�۸�
	}

}
