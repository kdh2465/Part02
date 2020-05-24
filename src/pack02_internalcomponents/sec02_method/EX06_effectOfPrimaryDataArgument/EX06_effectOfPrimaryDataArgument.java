package pack02_internalcomponents.sec02_method.EX06_effectOfPrimaryDataArgument;

public class EX06_effectOfPrimaryDataArgument {
	public static void main(String[] args) {
		
		int a = 3;
		
		int result1=twice(3);

		int result2=twice(a);
		
		System.out.println(result1);	//6
		System.out.println(result2);	//6
		System.out.println(a);			//3
				
	}
	
	public static int twice(int a){
		a=a*2;		
		return a;
	}
		
}
