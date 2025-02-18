package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {
	public static void main(String[]args) {
		//GIGO - 변수 -입력 - 처리 - 출력
		float pi;
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.println("파이값을 입력하시오.");
		pi = sc.nextFloat();
		System.out.print("파이값은" + pi + "입니다.> \n");
		System.out.printf("파이값은 %f입니다.>" , pi);
		System.out.printf("\n파이값은 %.2f입니다.>" , pi);
	}
}
/*
 * Scanner이용해서 파이값을 입력받고 출력하시오.
  파이값을 입력하시오 >_ 입력받기 3.14 (자료형선택)
  파이값은 **입니다.
 */