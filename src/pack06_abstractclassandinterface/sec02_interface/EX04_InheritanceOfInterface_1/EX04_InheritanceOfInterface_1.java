package pack06_abstractclassandinterface.sec02_interface.EX04_InheritanceOfInterface_1;

interface A {}
interface B {}

//#1. 단일 인터페이스 상속(구현)
class C implements A {}

//#2. 다중 인터페이스 상속(구현)
class D implements A,B {}

//#2. 클래스 1개, 인터페이스 2개 다중 상속(구현)
class E extends D implements A,B {}

public class EX04_InheritanceOfInterface_1 {
	
}
 