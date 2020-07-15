package pack05_inheritanceandpolymorphism.sec06_objectclass.EX03_ObjectMethod_hashcode;
import java.util.HashMap;

/*Object Ŭ������ hashCode() �޼���*/

class A { //equals() �޼��� overriding
	String name;
	A(String name) {
		this.name=name;		
	}	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof A) { 
			if (this.name == ((A)obj).name)
				return true;			
		}		
		return false;
	}	
	@Override
	public String toString() {	
		return name;
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
	@Override
	public int hashCode() {		
		return name.hashCode();
	}	
	@Override
	public String toString() {	
		return name;
	}
}

public class EX03_ObjectMethod_hashcode {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "������1");
		hm1.put(1, "������2");
		hm1.put(2, "������3");
		System.out.println(hm1); //{1=������2, 2=������3}
				
		HashMap<A, String> hm2 = new HashMap<>();		
		hm2.put(new A("ù��°"), "������1");
		hm2.put(new A("ù��°"), "������2");
		hm2.put(new A("�ι�°"), "������3");
		System.out.println(hm2); //{ù��°=������2, �ι�°=������3, ù��°=������1}
		
		HashMap<B, String> hm3 = new HashMap<>();		
		hm3.put(new B("ù��°"), "������1");
		hm3.put(new B("ù��°"), "������2");
		hm3.put(new B("�ι�°"), "������3");
		System.out.println(hm3); //{ù��°=������2, �ι�°=������3}
				
	}
}
