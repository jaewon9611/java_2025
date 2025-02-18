package com.company.java002_ex;

public class VarEx02 {
	public static void main(String [] args) {
		int a = 10;
		int b = 3;
		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.println(a + "-" + b + "=" + (a-b));
		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println(a + "/" + b + "=" + (a/b));
		System.out.printf("\n%d + %d = %d" , a, b, a + b);
		System.out.printf("\n%d / %d = %f", a, b, (float)a/b);
		
	}
}
/*  1-1. 정수형 데이터를 담을수 있는 변수 a 만들고
  1-2. a에 10대입하시오
  1-3. 정수형 데이터를 담을수 있는 변수 b 만들고
  1-4. b에 3대입하시오
  1-5.
  System.out.println 을 4번 사용해서
  10 + 3 = 13
  10 - 3 = 7
  10 * 3 = 30
  10 / 3 = 3
*/