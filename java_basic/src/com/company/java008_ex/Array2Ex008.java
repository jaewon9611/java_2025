package com.company.java008_ex;

public class Array2Ex008 {
	public static void main(String[] args) {
		int[][] arr= new int[4][4];
		
		int data = 1;
//		arr[0][0] = data++;
//		arr[0][1] = data++;
//		arr[0][2] = data++;
//		arr[0][3] = data++;
		
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++){
				arr[ch][kan] = data++;
				System.out.print(arr[ch][kan] +"\t");
			}
			data=1;
			System.out.println();
		}
	}
}
