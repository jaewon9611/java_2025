package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main(String[] args) {
		int num = 0;
		String result = "남자";
		Scanner sc= new Scanner(System.in);
		//
		System.out.println("숫자 입력");
		num = sc.nextInt();
		//
		if (num%2==1) {result=("남자");}
		else  {result=("여자");}
		System.out.println(result);
		//
		
	}
}/*
연습문제6)
패키지명 : com.company.java004_ex
클래스명 : IfEx006
출력내용 : 숫자를 입력받아 홀수면 남자, 짝수면 여자 출력
*/
