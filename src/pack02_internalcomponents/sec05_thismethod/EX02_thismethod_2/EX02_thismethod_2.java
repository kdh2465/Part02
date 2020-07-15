package pack02_internalcomponents.sec05_thismethod.EX02_thismethod_2;

/*this()의 활용*/

class A{
	int m1, m2, m3, m4;
	A(){
		m1=1;
	    m2=2; 
	    m3=3; 
	    m4=4;
	}
	A(int a){
		m1=a;
	    m2=2; 
	    m3=3; 
	    m4=4; 
	  }
	A(int a, int b){
		m1=a;
	    m2=b; 
	    m3=3; 
	    m4=4; 
	}
	void print() {
		System.out.println(m1+", "+m2+", "+m3+", "+m4);
	}
}
class B{
	int m1, m2, m3, m4;
	B(){
		m1=1;
	    m2=2; 
	    m3=3; 
	    m4=4;
	}
	B(int a){
		this();
		m1=a; 
	  }
	B(int a, int b){
		this(a);
	    m2=b; 
	}
	void print() {
		System.out.println(m1+", "+m2+", "+m3+", "+m4);
	}
}

public class EX02_thismethod_2 {
	public static void main(String[] args) {
		
		//# 세 가지 객체 생성 방법 (this() 미사용)
		A a1 = new A(); 		a1.print();	//1,2,3,4
		A a2 = new A(10);		a2.print(); //10,2,3,4
		A a3 = new A(10,20);	a3.print(); //10,20,3,4
		System.out.println();
		
		//# 세 가지 객체 생성 방법 (this() 사용)
		B b1 = new B(); 		b1.print();	//1,2,3,4
		B b2 = new B(10);		b2.print(); //10,2,3,4
		B b3 = new B(10,20);	b3.print(); //10,20,3,4
				
	}
}
