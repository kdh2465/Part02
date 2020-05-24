package pack03_externalcomponents.sec02_externalclass.EX03_ExternalClass_1;

//하나의 파일에 외부 클래스 작성

class A {
	int m=3;
	int n=4;
	void print() {
		System.out.println(m+", "+n);
	}
}

public class EX03_ExternalClass_1 {
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}
