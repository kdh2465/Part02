package pack05_inheritanceandpolymorphism.sec03_methodoverriding.EX07_MethodOverriding_2;

class Animal {
	void cry() {
		
	}
}

class Bird extends Animal {
	void cry() {
		System.out.println("±±");		
	}
}
class Dog extends Animal {
	void cry() {
		System.out.println("�۸�");		
	}
}
class Cat extends Animal {
	void cry() {
		System.out.println("�߿�");		
	}
}

public class EX07_MethodOverriding_2 {
	public static void main(String[] args) {
		
		//#1. ������ Ÿ������ ���� + ������ Ÿ������ ��ü ����
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry(); //��¾���
		bb.cry(); //±±
		cc.cry(); //�߿�
		dd.cry(); //�۸�
		
		//#2. Animal Ÿ������ ���� + �ڽ�Ŭ���� Ÿ������ ��ü ���� (������ ǥ��)
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry(); //±±
		ac.cry(); //�߿�
		ad.cry(); //�۸�
		
		//#3. �迭�� ����
		Animal[] animals = new Animal[] {new Bird(), new Cat(), new Dog()};
		for(Animal animal : animals) {
			animal.cry(); 
		} //±±, �߿�, �۸�
					
	}

}
