package pack02_internalcomponents.sec04_thiskeyword.EX01_ThisKeyword_1;

/*������ this Ű���� �ڵ� �߰� */

class A {
	int m;
	int n;

	void init(int a, int b){
		int c=3;
		m=a; //this.m=a
		n=b; //this.n=b
	}
	void work(){
		init(2, 3); //this.init(2,3)
	}
}

public class EX01_ThisKeyword_1 {
	public static void main(String[] args) {
		
		//#1. ��ü ����
		A a = new A();
		
		//#2. �޼���ȣ�� �� �ʵ尪 ���
		a.work(); 
		System.out.println(a.m);	//2
		System.out.println(a.n);	//3
		
	}
}
