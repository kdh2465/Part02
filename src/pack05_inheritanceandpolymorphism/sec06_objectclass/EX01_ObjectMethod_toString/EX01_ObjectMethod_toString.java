package pack05_inheritanceandpolymorphism.sec06_objectclass.EX01_ObjectMethod_toString;
 
/*Object Ŭ������ toString() �޼���*/

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
 
public class EX01_ObjectMethod_toString {
	public static void main(String[] args) {
		
		A aa = new A();
		System.out.printf("%x\n",aa.hashCode()); //�ؽ��ڵ�
		System.out.println(aa); //��Ű��.Ŭ������@�ؽ��ڵ�
		
		B bb = new B();		
		System.out.println(bb); //��Ű��.Ŭ������@�ؽ��ڵ�
				
	}
}
