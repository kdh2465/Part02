﻿package pack04_modifier_1.sec02_staticmodifier.EX04_StaticInitialBlock;

/*정적 초기화 블록*/

class A {

	int a;
	static int b;

	static {
		b = 5;
		System.out.println("클래스가 로딩될때 static block 실행");
	}

	A() {
		a = 3; // instance 필드의 초기화 위치
	}

}

public class EX04_StaticInitialBlock {
	public static void main(String[] args) {
		
		System.out.println(A.b);
		
	}
}
