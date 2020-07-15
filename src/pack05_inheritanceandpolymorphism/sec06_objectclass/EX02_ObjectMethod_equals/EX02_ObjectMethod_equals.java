package pack05_inheritanceandpolymorphism.sec06_objectclass.EX02_ObjectMethod_equals;

/*Object Ŭ������ equals(.) �޼���*/

class A {
	String name;
	A(String name) {
		this.name=name;		
	}
}

class B { //equals() �޼��� overriding
	String name;
	B(String name) {
		this.name=name;		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) { 
			if (this.name == ((B)obj).name)
				return true;			
		}		
		return false;
	}
}

public class EX02_ObjectMethod_equals {
	public static void main(String[] args) {
		
		A aa1 = new A("�ȳ�");
		A aa2 = new A("�ȳ�");
		
		System.out.println(aa1==aa2);		//false
		System.out.println(aa1.equals(aa2));//false
		
		B bb1 = new B("�ȳ�");
		B bb2 = new B("�ȳ�");
		
		System.out.println(bb1==bb2);		//false
		System.out.println(bb1.equals(bb2));//true
		
	}
}
