package com.company.java008;

public class Repeat004 {
	public static void main(String[] args) {
		int [][] arr = new int[2][3];
		
		int data = 10;
//		arr[0][0] = data+=10;
//		arr[0][1] = data+=20;
//		arr[0][2] = data+=30;
		
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++){
				arr[ch][kan] = data; data+=10;
				System.out.print(arr[ch][kan] +"\t");
			}
			data=50;
			System.out.println();
		}
	}
}
/*
0.new를 이용하여 다음과 배열을 작성한다.
1.배열명 : arr
2.값 : {10,20,30},{50,60,70}
3.for + length를 이용하여 배열안의 값을 출력하시오
*/
