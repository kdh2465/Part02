package pack02_internalcomponents.sec02_method.EX03_arrayArgumentMethod;

import java.util.Arrays;

/*�迭 �Ű������� ������ �޼��� ȣ��*/

public class EX03_arrayArgumentMethod {
	public static void main(String[] args) {
	
		//�迭 �Ű������� ������ �޼��� ȣ��		
		printArray(new int[] {1,2,3}); //[1,2,3]
		
		//printArray({1,2,3}); //����				
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}		
}
