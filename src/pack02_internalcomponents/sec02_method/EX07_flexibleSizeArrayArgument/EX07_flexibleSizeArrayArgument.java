package pack02_internalcomponents.sec02_method.EX09_flexibleSizeArrayArgument;

/*�޼����� �������� �迭 �Ű�����*/

public class EX09_flexibleSizeArrayArgument {
	public static void main(String[] args) {
		//#1. ���̰� ������ ���� ���� int�迭 �Ű�����
		method1(1,2); //�Ű���������:2 --> 1,2
		method1(1,2,3); //�Ű���������:3 --> 1,2,3
		method1(); //�Ű���������:0 --> X
		
		//#2. ���̰� ������ ���� ���� String�迭 �Ű�����
		method2("�ȳ�","�氡"); //�Ű���������:2 --> "�ȳ�","�氡"
		method2("��ť","����","����"); //�Ű���������:3 --> "��ť","����","����"
		method2(); //�Ű���������:0 --> X
		
	}
	public static void method1(int... values) {
		System.out.println("�Ű����� ���� : "+values.length);
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
//		for(int k: values) {
//			System.out.println(k);
//		}
	}
	public static void method2(String...values) {
		System.out.println("�Ű����� ���� : "+values.length);
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
//		for(String k: values) {
//			System.out.println(k);
//		}
	}
}
