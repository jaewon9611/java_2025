package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String[] args) {
		//변수
		int avg= 0; String result = "불합격";
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.println("평균점수 입력");
		avg = sc.nextInt();
		//처리
		if(avg>=60) 	{	System.out.println("합격");  }
		if(avg<60)		{	System.out.println("불합격"); }
		//출력
		System.out.println("--------------------");
		if(avg>60) {result = "합격";}
		System.out.println(result);
	}
}
/*
 연습문제1)
 패키지명 : com.company.java004_ex
 클래스명 : IfEx001
 출력내용 : 평균을 입력(Scanner)받아 60점이상이면 합격, 
 불합격여부를 출력하는 프로그램을 IF로 작성
 */
