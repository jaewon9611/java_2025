package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main(String [] args) {
		//   GIGO
		//   변수 - 입력 - 처리 - 출력
		//1. 변수
		int like;
		Scanner sc = new Scanner(System.in);
		//2. 입력
		System.out.println("좋아하는 수(정수) 입력하시오 > ");
		like = sc.nextInt();
		//3. 처리 pass
		
		//4. 출력
		System.out.println("좋으하는 숫자는" + like +"입니다.");
	}
}
/*
연습문제2) 
패키지명 : com.company.java002_ex
클래스명 : DataTypeEx002
출력내용 : Scanner이용해서 나이 입력받고 출력하시오.
  좋아하는 수(정수) 입력하시오 > _입력받기
  좋아하는 숫자는 ** 입니다.
*/