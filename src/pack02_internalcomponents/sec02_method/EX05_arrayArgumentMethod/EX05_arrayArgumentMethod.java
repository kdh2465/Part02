package pack02_internalcomponents.sec02_method.EX05_arrayArgumentMethod;

import java.util.Arrays;

public class EX05_arrayArgumentMethod {
	public static void main(String[] args) {
	
		//�迭 �Ű������� ������ �޼��� ȣ��		
		printArray(new int[] {1,2,3}); //[1,2,3]
		
		//printArray({1,2,3}); //����
				
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
		
}
