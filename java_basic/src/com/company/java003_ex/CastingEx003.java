package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
	public static void main(String[]args) {
		// 변수
		char big = ' ';
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("대문자를 입력하시오.");
		big = scanner.next().charAt(0);
		//처리
		//big += 32;
		//출력
		
		
		big = (char)(big+32); // ch (char:2byte) + 32 (int:4byte)
		System.out.println(big);
		
		float fl = 1+1.0f;
		System.out.println(fl);
	}
}
