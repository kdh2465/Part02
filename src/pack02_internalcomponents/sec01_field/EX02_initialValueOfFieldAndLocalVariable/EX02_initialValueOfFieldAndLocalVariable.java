package pack02_internalcomponents.sec01_field.EX02_initialValueOfFieldAndLocalVariable;

//#1. Ŭ���� ����
class A {
	boolean m1;	
	int m2;	
	double m3;	
	String m4;
	
	void printFieldValues() {
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
	}
	
	void printLocalVariable() {
		int k;
		//System.out.println(k); //����
	}
	
}

public class EX02_initialValueOfFieldAndLocalVariable {
	
	public static void main(String[] args) {
		
		//#2. Ŭ������ Ȱ���Ͽ� ��ü ����
		A a = new A();
		
		//#3. �ʵ尪 ���
		a.printFieldValues();
	}

}
