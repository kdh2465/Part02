package pack02_internalcomponents.sec05_thismethod.EX13_thismethod_1;

/*this() �޼����� ������ Ư¡�� �ǹ�*/

class A{

	A(){
		System.out.println("ù��° ������");
	}
	A(int a){
		this(); //�ݵ�� ù �ٿ� ��ġ
		System.out.println("�ι�° ������");
	}
}

public class EX13_thismethod_1 {
	public static void main(String[] args) {
		
		//# �ΰ��� ��ü ���� ���
		A a1 = new A(); 	//ù��° ������
		A a2 = new A(3); 	//ù��° ������ - �ι�° ������
		
	}
}
