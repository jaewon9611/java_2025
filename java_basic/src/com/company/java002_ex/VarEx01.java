package com.company.java002_ex;

public class VarEx01 {
	public static void main(String [] args) {
		int apple = 1000;
		System.out.println("사과 가격은 " + apple +"원 입니다.");
		// System.out.printf("사과 가격은 %d원입니다.",apple);
		apple = apple + 1000;
		System.out.println("사과 가격은 " + apple +"원 입니다.");
		//System.out.printf("사과 가격은 %d원입니다.",apple);
	}
}
//  1-1. apple 라는 변수 만들기
//  1-2. 1-1.에서 만든 변수에 1000이라는 데이터 대입하기 (자료형 int)
//  1-3. 1-1.에서 만든 변수이용해서 
//       사과가격은 1000원입니다 출력
//  1-4. 1-1.에서 만든 변수에 2000이라는 데이터 대입하기 
//  1-5. 1-1.에서 만든 변수이용해서 
//       사과가격은 2000원입니다 출력