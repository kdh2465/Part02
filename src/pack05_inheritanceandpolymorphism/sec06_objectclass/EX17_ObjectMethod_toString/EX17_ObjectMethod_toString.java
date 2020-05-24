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
		return "�ʵ尪: a="+a + ", b="+b;
	}
}
 
public class EX17_ObjectMethod_toString {
	public static void main(String[] args) {
		
		A aa = new A();
		System.out.printf("%x\n",aa.hashCode()); //70dea4e
		System.out.println(aa); //��Ű��.Ŭ������@�ؽ��ڵ�
		
		B bb = new B();		
		System.out.println(bb); //��Ű��.Ŭ������@�ؽ��ڵ�
				
	}
}
