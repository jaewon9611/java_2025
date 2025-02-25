package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		num = sc.nextInt();
		
			 if (num==1) {System.out.println("one");}
		else if (num==2) {System.out.println("two");}
		else if (num==3) {System.out.println("three");}
		else			 {System.out.println("1,2,3이 아니다");}
		}
	}
/*
연습문제1)
패키지명 : com.company.java004_ex
클래스명 : IfEx003
출력내용 : 숫자한개를 입력(Scanner)받아
		 만약1을 입력했다면 one,
		 만약2을 입력했다면 two,
		 만약3을 입력했다면 three,
		 1,2,3이 아니라면 1,2,3이 아니다를 출력하는 프로그램을 작성하시오.
*/