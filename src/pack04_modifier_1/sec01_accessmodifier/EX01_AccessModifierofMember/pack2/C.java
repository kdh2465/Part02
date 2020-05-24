package pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack2;

import pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack1.A;

public class C {
	
	public void print(){ //a 사용가능
		A a = new A(); //객체생성 가능
	    System.out.println(a.a); //사용가능
	    //System.out.println(a.b); //사용불가능
	    //System.out.println(a.c); //사용불가능
	    //System.out.println(a.d); //사용불가능 
	}

}
