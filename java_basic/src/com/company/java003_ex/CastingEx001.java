package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String[]args) {
		// 변수영역
		int num , num2; float result;
		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.println("숫자입력1"); num = sc.nextInt();
		System.out.println("숫자입력2"); num2 = sc.nextInt();
		// 처리
		result = (float)num/num2;
		// 출력
		//System.out.println                      (String.format("%.2f", num3) );
		System.out.print(num +" / " +num2+ " = " + String.format("%.2f", result));
		// System.out.printf("총점 : %d \n평균 : %.2f" , total , avg);  // 299  99.67
		System.out.printf("%d / %d = %.2f",num,num2,result);
	}
}
/**
 연습문제1)  
패키지명 : com.company.java003_ex
클래스명 : CastingEx001
출력내용 : Scanner이용해서 나누기 프로그램 만들기
	숫자입력1 > _입력받기 10 (자료형을 int)
	숫자입력2 > _입력받기 3 (자료형을 int)
	10/3 = 3.33
 1단계) 변수 - 입력- 처리- 출력
 */