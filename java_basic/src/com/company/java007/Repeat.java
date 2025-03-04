package com.company.java007;

public class Repeat {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		for(int i=0; i<arr.length; i++) {if(i!=2) {
			System.out.print(arr[i]+ ",");
		}
		else {System.out.println(arr[i]);}
		}
	}
}
/*
0)  이론
1.   자바의 자료형은 (   )   /  (   )  로 분류된다. 기본형 참조형
2.   자바의 기본형은 (   ,    ,   ,    ,   ,   ,   ,   ) 가 있다. char byte short int long boolean float double
3.   자바의 형변환은 (   ) 빼고 기본형에서 가능하다.  boolean
4.   ch  가 대문자일경우 조건식작성 ch>='A' && ch<='Z'
5.   ch  가 소문자일경우 조건식작성 ch>='a' && ch<='z'
6.   a   가 0~100사이일 경우 조건식 작성 a>=0 && a<=100
*/