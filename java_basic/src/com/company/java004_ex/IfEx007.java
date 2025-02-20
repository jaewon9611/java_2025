package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	public static void main(String[] args) {
		int num1, num2;
		char ch  = ' ';
		String result = "";
		Scanner sc= new Scanner(System.in);
		//
		System.out.print("1. 정수를 하나 입력하세요 →"); num1 = sc.nextInt();
		System.out.print("2. 정수를 하나 입력하세요 →"); num2 = sc.nextInt();
		System.out.print("3. 연산자를 입력해주세요(+,-,*,/) →"); ch = sc.next().charAt(0);
		//
		
			 if(ch=='+') {result=""+(num1+num2);}
		else if(ch=='-') {result=""+(num1-num2);}
		else if(ch=='*') {result=""+(num1*num2);}
		else if(ch=='/') {result= String.format("%.2f",(num1/(float)num2));}
		System.out.println(""+num1 + ch + num2 +"=" + result);
		
/*		 	 if(ch=='+') {	System.out.printf("%d%c%d = %d\n"   , num1 , ch, num2, num1+num2);}
		else if(ch=='-') {	System.out.printf("%d%c%d = %d\n"   , num1 , ch, num2, num1-num2);}
		else if(ch=='*') {	System.out.printf("%d%c%d = %d\n"   , num1 , ch, num2, num1*num2);}
		else if(ch=='*') {	System.out.printf("%d%c%d = %2.f\n" , num1 , ch, num2, num1/(float)num2);}	
*/
	}
}
/*
연습문제7)  ※ 숙제
패키지명 : com.company.java004_ex
클래스명 :  IfEx007
출력내용 :  계산기

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > -
10-3=7
*/