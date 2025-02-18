package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main(String[]args) {
		int lan , eng , math, total; double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하시오.");
		lan = sc.nextInt();
		System.out.println("영어점수를 입력하시오.");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하시오.");
		math = sc.nextInt();
//		System.out.println("total" +(lan + eng + math));
//		System.out.println("평균 :" +(lan + eng + math)/3);
		total = lan + eng + math;
		avg = total/3.0; // 정수/정수 = 정수   299/3 몫 > 해결방안) 정수/실수
		System.out.printf("총점 : %d \n평균: %.2f", total , avg);
		
	}
}
/*
  Scanner이용해서 성적처리를 입력받고 출력하시오.
  국어점수를 입력하시오. _입력받기 100
  영어점수를 입력하시오. _입력받기 100
  수학점수를 입력하시오. _입력받기 99
 */