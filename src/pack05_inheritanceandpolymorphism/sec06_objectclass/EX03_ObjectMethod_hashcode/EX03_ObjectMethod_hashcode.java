package pack05_inheritanceandpolymorphism.sec06_objectclass.EX03_ObjectMethod_hashcode;
import java.util.HashMap;

/*Object 클래스의 hashCode() 메서드*/

class A { //equals() 메서드 overriding
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

class B { //equals() 메서드 overriding
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
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1); //{1=데이터2, 2=데이터3}
				
		HashMap<A, String> hm2 = new HashMap<>();		
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		System.out.println(hm2); //{첫번째=데이터2, 두번째=데이터3, 첫번째=데이터1}
		
		HashMap<B, String> hm3 = new HashMap<>();		
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		System.out.println(hm3); //{첫번째=데이터2, 두번째=데이터3}
				
	}
}
