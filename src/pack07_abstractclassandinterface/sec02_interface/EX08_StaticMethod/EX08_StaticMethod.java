package pack07_abstractclassandinterface.sec02_interface.EX08_StaticMethod;

/*�������̽����� ����(staic) �޼���*/

interface A{
	static void abc() {
		System.out.println("A �������̽��� ����(static) �޼���");
	}
}

public class EX08_StaticMethod {
	public static void main(String[] args) {
		//#. �������̽� A�� �����޼��� ȣ�� 
		A.abc(); //A �������̽��� ����(static) �޼���
	}
}
