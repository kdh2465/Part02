package pack07_abstractclassandinterface.sec02_interface.EX02_InheritanceOfInterface_1;

/*�������̽��� Ŭ������ ��� Ű���� */

interface A {}
interface B {}

//#1. ���� �������̽� ���(����)
class C implements A {}

//#2. ���� �������̽� ���(����)
class D implements A,B {}

//#2. Ŭ���� 1��, �������̽� 2�� ���� ���(����)
class E extends D implements A,B {}

public class EX02_InheritanceOfInterface_1 {
	public static void main(String[] args) {
		
	}
}
 