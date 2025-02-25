package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx006 {
	public static void main(String[] args) {
		//double[] arr= {1.1, 1.2, 1.3, 1.4, 1.5};
		double[] arr = new double[5];
		
		//		double data = 1.1;
		//		arr[0] =data; data+=0.1;
		//		arr[1] =data; data+=0.1;
		//		arr[2] =data; data+=0.1;
		//		arr[3] =data; data+=0.1; 
		//		arr[4] =data; data+=0.1;
		double data=1.1;
		for(int i=0; i<arr.length; i++) {arr[i] = data; data+=0.1;}
		for(int i=0; i<arr.length; i++) {System.out.print(String.format("%.1f", arr[i]) + "\t");}
	}
}
/*
new 연산자 이용해서 배열만들기
1. 배열명 : arr     
2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5    for+length 이용해보기
3. for + length 로 출력
*/
