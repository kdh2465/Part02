package pack07_abstractclassandinterface.sec02_interface.EX10_StaticMethod;

/*�������̽����� ����(staic) �޼���*/

interface A{
	static void abc() {
		System.out.println("A �������̽��� ����(static) �޼���");
	}
}

public class EX10_StaticMethod {
	public static void main(String[] args) {
		//#. �������̽� A�� �����޼��� ȣ�� 
		A.abc(); //A �������̽��� ����(static) �޼���
	}
}
