
package pack02_internalcomponents.sec02_method.EX06_methodOverloading;

/*�޼����� �����ε�(Overloading)*/

public class EX06_methodOverloading {
	public static void main(String[] args) {
		
		print();
		print(3);
		print(5.8);
		print(2, 5);
				
	}
	
	public static void print(){
		System.out.println("�����Ͱ� �����ϴ�");
	}
	public static void print(int a){
		System.out.println(a);
	}
	public static void print(double a){
		System.out.println(a);
	}
	public static void print(int a, int b){
		System.out.println(a + ", "+b);
	}	
//	public static int print(int a, int b){
//		return a+b;
//	} //�����ε� �Ұ�
			
}
