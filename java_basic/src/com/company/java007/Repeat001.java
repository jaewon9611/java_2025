package com.company.java007;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		/*0)  이론
		1.   자바의 자료형은 (   )   /  (   )  로 분류된다. 기본형 참조형
		2.   자바의 기본형은 (   ,    ,   ,    ,   ,   ,   ,   ) 가 있다. byte short char int long boolean float double
		3.   자바의 형변환은 (   ) 빼고 기본형에서 가능하다.  boolean
		4.   ch  가 대문자일경우 조건식작성 ch>='A' && ch<='Z'
		5.   ch  가 소문자일경우 조건식작성 ch>='a' && ch<='z'
		6.   a   가 0~100사이일 경우 조건식 작성 a>=0 && a<=100
*/		
		
		
		
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1 2 3 을 입력하세요"); num=sc.nextInt();
		if(num==1) {System.out.println("apple");}
		else if(num==2) {System.out.println("banana");}
		else if(num==3) {System.out.println("coconut");}
		else {System.out.println("숫자 1 2 3 중 하나를 입력하세요");}
		
//		 char a; 
//	        System.out.println("문자 'a', 'b', 'c' 중 하나를 입력하세요:");
//	        a = sc.next().charAt(0); // 문자열에서 첫 번째 문자만 입력받기
//
//	        if (a == 'a') {
//	            System.out.println("apple");}
//	         else if (a == 'b') {System.out.println("banana");}
//	         else if (a == 'c') {System.out.println("coconut");} 
//	         else {
//	            System.out.println("문자 'a', 'b', 'c' 중 하나를 입력하세요.");
	}
}
/*
숫자 하나를 입력받아 
if ver- a가 'a'이면 apple, 'b' banana , 'c'면 coconut
*/