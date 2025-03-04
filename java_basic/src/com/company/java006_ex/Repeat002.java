package com.company.java006_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력"); a=sc.nextInt();
		switch(a) {
		case 10 : System.out.println("10이다"); break;
		case 20 : System.out.println("20이다"); break;
		case 30 : System.out.println("30이다"); break;
		}
	}
}
