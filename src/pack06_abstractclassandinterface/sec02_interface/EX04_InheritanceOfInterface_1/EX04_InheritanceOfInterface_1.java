package pack06_abstractclassandinterface.sec02_interface.EX04_InheritanceOfInterface_1;

interface A {}
interface B {}

//#1. ���� �������̽� ���(����)
class C implements A {}

//#2. ���� �������̽� ���(����)
class D implements A,B {}

//#2. Ŭ���� 1��, �������̽� 2�� ���� ���(����)
class E extends D implements A,B {}

public class EX04_InheritanceOfInterface_1 {
	
}
 