package com.company.java009;

public class Repeat005 {
	public static void main(String[] args) {
		char[][] arr = new char[2][3];
		
		char ap='a';
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++) {
			arr[ch][kan]= ap++;
			System.out.print(arr[ch][kan] +"\t");
		}
		System.out.println();
		}
	}
}
/*
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr2
2. 값     :  {a,b,c}, {d,e,f}
3. for + length 를 이용하여  배열안의 값을을 출력하시오.
*/