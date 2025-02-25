package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String[]args) {
		int kor , eng , math, total;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하시오");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하시오");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하시오");
		math = sc.nextInt();
		total = kor + eng + math;
		avg = total/3.0;
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + avg);
	}
}
