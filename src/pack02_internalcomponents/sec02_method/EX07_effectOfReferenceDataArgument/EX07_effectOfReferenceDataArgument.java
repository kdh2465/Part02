package pack02_internalcomponents.sec02_method.EX07_effectOfReferenceDataArgument;

import java.util.Arrays;

/*참조자료형 매개개변수 값의 변화*/

public class EX07_effectOfReferenceDataArgument {
	public static void main(String[] args) {
		
		int[] array = new int[]{1,2,3};

		modifyData(array);

		printArray(array);
				
	}
	
	public static void modifyData(int[] a){
		a[0]=4; a[1]=5; a[2]=6;
		//printArray(a); //[4, 5, 6]
	}
	public static void printArray(int[] a){
		System.out.println(Arrays.toString(a));
	}
		
}
