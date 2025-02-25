package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx007 {
	public static void main(String[] args) {
	char [] arr = new char[5];
	char data= 'A';
	arr[0] = 'A';
	arr[1] = 'B';
	arr[2] = 'C';
	arr[3] = 'D';
	arr[4] = 'E';
	for(int i =0; i<arr.length; i++) {arr[i] = data; data++;}
		for(int i =0; i<arr.length; i++) {System.out.print(arr[i] + "\t");}
	

	}
}
/*
 클래스명 :  ArrayEx007
    new 연산자 이용해서 배열만들기
    1. 배열명 : arr     
    2. 값 넣기 : A   B   C   D   E    for+length 이용해보기
    3. for + length 로 출력
*/
