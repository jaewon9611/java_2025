	package com.company.java007_ex;

public class Array2Ex001 {
	public static void main(String[] args) {
		int[][] arr2 = { {100,200,300},
					    {400,500,600}
		};
		System.out.print(arr2[0][0]); System.out.print(arr2[0][1]); System.out.print(arr2[0][2]);
		System.out.println();
		
		System.out.print(arr2[1][0]); System.out.print(arr2[1][1]); System.out.print(arr2[1][2]);
		System.out.println();
		
		for(int kan=0; kan<arr2.length; kan++){System.out.print(arr2[0][kan]);}
		for(int kan=0; kan<arr2.length; kan++){System.out.print(arr2[1][kan]);}
		System.out.println();
		for(int ch=0; ch<arr2.length; ch++) {
			for(int kan=0; kan<arr2[0].length; kan++){System.out.print(arr2[ch][kan] +"\t");}
			System.out.println();
		}
	}
}
/*int[][] arr2={{100,200,300},{400,500,600}};
이중for 이용해서 출력하기
*/