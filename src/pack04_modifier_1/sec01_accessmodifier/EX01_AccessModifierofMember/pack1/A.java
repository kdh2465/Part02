package pack04_modifier_1.sec01_accessmodifier.EX01_AccessModifierofMember.pack1;

public class A {
	public int a=1;
	protected int b=2;
	int c=3;
	private int d=4;

	public void print(){ //a, b, c, d ��밡��
	    System.out.println(a); //��밡��
	    System.out.println(b); //��밡�� 
	    System.out.println(c); //��밡�� 
	    System.out.println(d); //��밡�� 
	}
}
