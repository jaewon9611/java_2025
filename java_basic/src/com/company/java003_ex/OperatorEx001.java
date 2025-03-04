package com.company.java003_ex;

public class OperatorEx001 {
	public static void main(String[]agrs) {
		//먼저() 값(+) (비)교(조)건 (대)입0
		int a=3, b=10;
		System.out.println(b+=10 -a--); // 17
		//1) a--  3
		//2) 10-a 3
		//3) b+= 2) 까지 연산된거 b+=7 10+=7 b=17
		//4) ); 후 -- a=2
		System.out.println(a+=5); // 7
		//1) a+=5 2+=5 7
		System.out.println(a>=10 || a<0 && a>3); // false : false || false || true 이지만 &&가 먼저 연산되어 나오기때문
		//() 값 비교(>,<) 조건(&&)대입
		//       츄(>.<)  &&,||
		//1) a>=10 a<0 a>3
		//
	}
}
/*
int a=3, b=10;
syso b+=10-a--  //?
syso a+=5
syso a>=1 ||a<0 && a>3
*/
