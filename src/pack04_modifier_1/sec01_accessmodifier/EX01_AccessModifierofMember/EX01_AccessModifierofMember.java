package pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember;

import pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack1.A;
import pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack1.B;
import pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack2.C;
import pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack2.D;

//���Ͽ� �и��Ͽ� �ۼ�

public class EX01_AccessModifierofMember {
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();	//1,2,3,4
		b.print();  //1,2,3
		c.print();  //1
		d.print();  //1,2
		
	}
}