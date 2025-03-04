package com.company.java005_ex;

public class ForEx003 {
	public static void main(String[] args) {
		int result = 0;
		for(int i=1; i<=10; i++) {result += i; // 현재 합을 더하는 곳에 1을 더하고 sum이 1인지 확인 result=+i 의 뜻은 result = result + i;
		System.out.print((i==1? "" : "+")+i);
		}
		System.out.print("=" +result);
	}
}// 왜 result=+i 가 55가 되는지? / 패턴을 보자면 result+=1; == System.out.print("result+1"):
//														 System.out.print("result+2"):
// 														 System.out.print("result+3"):
//														 System.out.print("result+4"):
//														result 뒤에 더해지는 숫자가 반복문 즉 i 임
// 그래서 result
/*
연습문제3)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx003
출력내용 :   for 이용
1~10까지의 합을 구하시오. 55
1+2+3+4+5+6+7+8+9+10=55
 */
