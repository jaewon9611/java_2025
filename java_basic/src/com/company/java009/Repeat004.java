package com.company.java009;

public class Repeat004 {
	public static void main(String[] args) {
		char[] arr = new char[3];
		char ap='a';
		// arr[0][0]=a
		// arr[0][1]=b
		for(int kan=0; kan<arr.length; kan++){arr[kan]= ap++;
		System.out.print(arr[kan] +"\t");
		}
	}
}

/*
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : a  b   c
3. for + length 를 이용하여  배열안의 a,b,c을 출력하시오.
*/