package pack06_modifier_2.sec02_abstractmodifier.EX03_abstractmodifier_1;

/*�Ϲ�Ŭ������ ����Ͽ� �������̵� ����*/

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

public class EX03_abstractmodifier_1 {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		animal1.cry(); //�߿�
		
		Animal animal2 = new Dog();
		animal2.cry(); //�۸�
	}

}
