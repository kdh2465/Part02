package pack05_inheritanceandpolymorphism.sec01_inheritancepolymorphism.EX01_ClassInheritance;

/*Ŭ������ ��Ӱ� ��밡���� ���*/

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}	
}

class Student extends Human {
	int studentID;
	void goToSchool() {}
}

class Worker extends Human {
	int workerID;
	void goToWork() {}
}


public class EX01_ClassInheritance {
	public static void main(String[] args) {
		//#1. Human ��ü ���� �� �ʵ�/�޼��� ��� (�ʵ�2��, �޼���2��)
		Human h = new Human();		
		h.name="ȫ�浿";
		h.age=16;
		h.eat();
		h.sleep();
		
		//#2. Student ��ü ���� �� �ʵ�/�޼��� ��� (�ʵ� 2+1��, �޼��� 2+1��)
		Student s = new Student();
		s.name="��μ�";
		s.age=15;
		s.studentID=128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//#3. Worker ��ü ���� �� �ʵ�/�޼��� ��� (�ʵ� 2+1��, �޼��� 2+1��)
		Worker w = new Worker();
		w.name="������";
		w.age=30;
		w.workerID=128;
		w.eat();
		w.sleep();
		w.goToWork();
		
	}
}
