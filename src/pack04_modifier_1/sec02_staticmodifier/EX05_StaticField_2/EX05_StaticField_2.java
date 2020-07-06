package pack04_modifier_1.sec02_staticmodifier.EX05_StaticField_2;

/*정적필드의 공유기능*/

public class EX05_StaticField_2 {
	public static void main(String[] args) {
	
		A a1 = new A();
		A a2 = new A();

		a1.m=5;	//인스턴스 필드
		a2.m=6;	//인스턴스 필드

		System.out.println(a1.m); //5
		System.out.println(a2.m); //6
		
		//# static 필드의 공유
		a1.n=7; //static 필드 
		a2.n=8; //static 필드 

		System.out.println(a1.n); //8
		System.out.println(a2.n); //8

		A.n=9;
		System.out.println(a1.n); //9
		System.out.println(a2.n); //9
						
	}
}
