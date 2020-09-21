package pack03_externalcomponents.sec01_packageimport.EX02_PackageImport_2;

import pack03_externalcomponents.sec01_packageimport.common.A;

/*외부패키지의 클래스 사용방법 #2 (임포트 구문 사용)*/

public class EX02_PackageImport_2 {
	public static void main(String[] args) {
		
		A a = new A();		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
	}
}
