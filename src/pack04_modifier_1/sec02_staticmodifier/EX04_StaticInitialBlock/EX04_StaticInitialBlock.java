package pack04_modifier_1.sec02_staticmodifier.EX04_StaticInitialBlock;

/*���� �ʱ�ȭ ����*/

class A {

	int a;
	static int b;

	static {
		b = 5;
		System.out.println("Ŭ������ �ε��ɶ� static block ����");
	}

	A() {
		a = 3; // instance �ʵ��� �ʱ�ȭ ��ġ
	}

}

public class EX04_StaticInitialBlock {
	public static void main(String[] args) {
		
		System.out.println(A.b);
		
	}
}