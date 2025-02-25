package com.company.java006_ex;

import java.util.Scanner;

public class Repeat005 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력"); a=sc.nextInt();
//		if(a==10) {System.out.println("10이다");}
//		else if (a==20) {System.out.println("20이다");}
//		else if (a==30) {System.out.println("30이다");}
		
		
//		switch(a) {
//		case 10: System.out.println("10이다"); break;
//		case 20: System.out.println("20이다"); break;
//		case 30: System.out.println("30이다"); break;
//		}
//		for(a=1; a<=3; a++) {System.out.print(a +"\t");}
		for(;;) {
			System.out.println("숫자 입력"); a=sc.nextInt();if(a==1) break;
			
		}
	}
}
