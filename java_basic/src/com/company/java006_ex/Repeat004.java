package com.company.java006_ex;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("숫자 1입력시 무한반복 종료");
			int a=sc.nextInt();
			if(a==1) {break;}
		}
	}
}
