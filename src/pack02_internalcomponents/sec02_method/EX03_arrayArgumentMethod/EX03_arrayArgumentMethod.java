package pack02_internalcomponents.sec02_method.EX03_arrayArgumentMethod;

import java.util.Arrays;

/*배열 매개변수를 가지는 메서드 호출*/

public class EX03_arrayArgumentMethod {
	public static void main(String[] args) {
	
		//배열 매개변수를 가지는 메서드 호출		
		printArray(new int[] {1,2,3}); //[1,2,3]
		
		//printArray({1,2,3}); //오류				
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}		
}
