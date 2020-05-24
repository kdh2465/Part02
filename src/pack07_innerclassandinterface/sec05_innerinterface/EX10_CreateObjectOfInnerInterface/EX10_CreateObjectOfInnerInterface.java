package pack07_innerclassandinterface.sec05_innerinterface.EX10_CreateObjectOfInnerInterface;

class A{
	interface B{
		public abstract void bcd();
	}
}
//��ü���� ��� 1-1. �̳��������̽� ���� Ŭ���� ����
class C implements A.B{
	public void bcd() {
		System.out.println("�̳��������̽� ���� Ŭ���� ����");
	};
}

public class EX10_CreateObjectOfInnerInterface {
	public static void main(String[] args) {
		//��ü ���� ��� 1-2. ���� Ŭ������ ��ü ����
		C c = new C();
		c.bcd();
		
		//��ü ���� ��� 2. �͸��̳�Ŭ������ ��ü ����
		A.B b = new A.B() {
			@Override
			public void bcd() {
				System.out.println("�͸��̳�Ŭ������ ��ü ����");				
			}
		};
		b.bcd();		
	}
}
