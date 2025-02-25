package com.company.java007_ex;

public class Array2Ex004 {
	public static void main(String[] args) {
		char[][] arr= new char[2][3];
		
		char data='A';
//		arr[0][0] = data++;
//		arr[0][1] = data++;
//		arr[0][2] = data++;
		for (int ch = 0; ch < arr.length; ch++) { // #1 층의 정보
			for (int kan = 0; kan < arr[0].length; kan++) { // #2 칸의 정보
				arr[ch][kan] = data++;
				System.out.print(arr[ch][kan] + "\t");
			} //#3 한층이 변경되고난후 해야할일
			data='B';
			System.out.println();
		}
	}
}
/*
연습문제12)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex004
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   A   B   C
   B   C   D
 */
