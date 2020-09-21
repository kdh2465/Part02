package pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack2;

import pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack1.A;

public class D extends A{
	
	public void print(){ //a, b 사용가능
		
	    System.out.println(a); //사용가능
	    System.out.println(b); //사용가능
	    //System.out.println(c); //사용불가능
	    //System.out.println(d); //사용불가능 
	}

}
