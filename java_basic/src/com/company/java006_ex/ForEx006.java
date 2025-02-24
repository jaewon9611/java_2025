package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String[] args) {
		//변수
		int num , a , b; char op =' '; double result = ' ';
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("정수 하나를 입력하세요 >"); a=sc.nextInt();
			if(a>100) {System.out.println("0~100사이 숫자를 이력하세요"); break;}
			System.out.print("정수 하나를 입력하세요 >"); b=sc.nextInt();
			if(b>100) {System.out.println("0~100사이 숫자를 이력하세요"); break;}
			System.out.print("연산자(+,-,*,/)를 입력하세요"); op=sc.next().charAt(0);
			if(op=='+' && op=='-' && op=='*' && op=='/') {System.out.println("연산자를 입력하세요");break;}
				 if(op=='+') {result=a+b;}
			else if(op=='-') {result=a-b;}
			else if(op=='*') {result=a*b;}
			else if(op=='/') {result=a/(double)b;}	
			System.out.println(""+a + op + b + "=" + (op!='/' ? ""+(int)result: String.format("%.2f", result)));
			break;// 큰 따옴표 넣은 이유 숫자 사이 문자 올경우 b를 숫자로 변환하여 계산하기 때문
		}
		
	}
}
//		System.out.print("정수 하나를 입력하세요"); b=sc.nextInt();
//		System.out.print("연산자(+,-,*,/)를 입력하세요"); op=sc.next().charAt(0);
//		//if(a<=100)
//		
//		System.out.println(""+a + op + b + "=" + re);}	
//		
//		if(op=='+') {System.out.println(a + '+' + b + '=' + (a+b));}
//		else if(op=='-') {System.out.println(a );}
