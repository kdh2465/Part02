package pack06_modifier_2.sec02_abstractmodifier.EX04_abstractmodifier_2;

/*�߻�Ŭ������ ����Ͽ� �������̵� ����*/

abstract class Animal{
	abstract void cry();
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

public class EX04_abstractmodifier_2 {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		animal1.cry(); //�߿�
		
		Animal animal2 = new Dog();
		animal2.cry(); //�۸�
	}

}