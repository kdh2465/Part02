package pack07_abstractclassandinterface.sec02_interface.EX02_InheritanceOfInterface_1;

/*인터페이스와 클래스의 상속 키워드 */

interface A {}
interface B {}

//#1. 단일 인터페이스 상속(구현)
class C implements A {}

//#2. 다중 인터페이스 상속(구현)
class D implements A,B {}

//#2. 클래스 1개, 인터페이스 2개 다중 상속(구현)
class E extends D implements A,B {}

public class EX02_InheritanceOfInterface_1 {
	public static void main(String[] args) {
		
	}
}
 