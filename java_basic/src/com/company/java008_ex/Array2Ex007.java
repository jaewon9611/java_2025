package com.company.java008_ex;

public class Array2Ex007 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int data = 0;
		arr[0][0] = data++;
		arr[0][1] = 2;
		arr[0][3] = 3;
		arr[0][4] = 4;
		
		
		for(int ch=0; ch<arr.length; ch++) {
		for(int kan=0; kan<arr[ch].length; kan++){
			arr[ch][kan] = data++;
			System.out.print(arr[ch][kan] + "\t");
			}
		System.out.println();
		}
	}
}
