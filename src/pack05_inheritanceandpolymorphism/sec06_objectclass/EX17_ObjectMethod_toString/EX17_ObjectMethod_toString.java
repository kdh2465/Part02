package pack05_inheritanceandpolymorphism.sec06_objectclass.EX17_ObjectMethod_toString;
 
class A {
	int a=3;
	int b=4;
}

class B { //toString() overriding
	int a=3;
	int b=4;
	@Override
	public String toString() {
		return "필드값: a="+a + ", b="+b;
	}
}
 
public class EX17_ObjectMethod_toString {
	public static void main(String[] args) {
		
		A aa = new A();
		System.out.printf("%x\n",aa.hashCode()); //70dea4e
		System.out.println(aa); //패키지.클래스명@해쉬코드
		
		B bb = new B();		
		System.out.println(bb); //패키지.클래스명@해쉬코드
				
	}
}
