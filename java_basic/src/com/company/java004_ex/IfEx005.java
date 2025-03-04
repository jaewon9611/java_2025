package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("문자 입력");
		ch = sc.next().charAt(0);
		//
		if(ch>='A' && ch<='Z') {System.out.println((char)(ch+32));}
		else if (ch>='a' && ch<='z') {System.out.println((char)(ch-32));}
		else {System.out.println("알파벳을 입력하세요.");}
	}
}
/*
연습문제5)
패키지명 : com.company.java004_ex
클래스명 : IfEx005
출력내용 : 문자를 입력받아 
		 대문자인지 이면 소문자로, 소문자이면 대문자로 변경하는 프로그램 작성
*/