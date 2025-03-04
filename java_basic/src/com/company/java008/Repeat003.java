package com.company.java008;

public class Repeat003 {
	public static void main(String[] args) {
		int[] arr = new int [3]; // 00 01 02
		
//		int data =10;
//		arr[0] = data;
//		arr[1] = data+=10;
//		arr[2] = data+=10;
		int data =10;
		for(int i=0; i<arr.length; i++ ){
			arr[i] =data; data+=10;}
		
		for(int i=0; i<arr.length; i++) {if(i!=3) {
			System.out.print(arr[i]+ ",");
		}
		else {System.out.println(arr[i]);}
		}
	}
}

/*
 * 0.new를 이용하여 다음과 배열을 작성한다.
1.배열명 : arr
2.값 : 10,20,30
3.for + length를 이용하여 배열안의 10,20,30 출력
*/
