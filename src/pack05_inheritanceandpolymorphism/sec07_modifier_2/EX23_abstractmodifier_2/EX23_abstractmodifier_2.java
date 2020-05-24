package pack05_inheritanceandpolymorphism.sec07_modifier_2.EX23_abstractmodifier_2;

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

public class EX23_abstractmodifier_2 {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		animal1.cry(); //�߿�
		
		Animal animal2 = new Dog();
		animal2.cry(); //�۸�
	}

}
