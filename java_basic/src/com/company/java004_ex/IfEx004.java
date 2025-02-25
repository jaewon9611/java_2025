package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.println("문자한개 입력하시오");
		ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {System.out.println("대문자");}
		else if(ch>='a' && ch<='z') {System.out.println("소문자");}
		else						{System.out.println("알파벳만 입력하세요");}
		}
	}
/*
연습문제4)
패키지명 : com.company.java004_ex
클래스명 : IfEx004
출력내용 : 문자한개 입력받아
	     대문자인지,소문자인지 판별하는 프로그램 작성
*/