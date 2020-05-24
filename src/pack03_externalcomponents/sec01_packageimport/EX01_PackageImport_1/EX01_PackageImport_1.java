package pack03_externalcomponents.sec01_packageimport.EX01_PackageImport_1;

public class EX01_PackageImport_1 {
	public static void main(String[] args) {
		
		pack03_externalcomponents.sec01_packageimport.common.A a = 
				new pack03_externalcomponents.sec01_packageimport.common.A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
	}
}
