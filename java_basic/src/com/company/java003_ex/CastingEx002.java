package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String[]args ) {
		// 변수영역
		int kor , eng , math ,total, lev; double avg;
		Scanner sc = new Scanner(System.in);
		// 입력영역
		System.out.println("국어점수"); kor = sc.nextInt();
		System.out.println("영어점수"); eng = sc.nextInt();
		System.out.println("수학점수"); math = sc.nextInt();
		// 처리영역
		total = kor + eng + math;
		avg   = (double)total/3.0;
		lev   = (int)avg/10;
		// 출력영역
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+":: GOOD  IT SCORE ::\r\n"
				+":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("국어	영어	수학	총점	평균	레벨");
		System.out.println(kor +"\t"+ eng+ "\t"  +math+ "\t" +total+ "\t" +String.format("%.2f", avg)+ "\t" +lev );
		System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%d\t",kor,eng,math,total,avg,lev);
		
	}
	
}
/**
 연습문제2) 
패키지명 : com.company.java003_ex
클래스명 : CastingEx002
출력내용 : Scanner이용해서 성적처리를 입력받고 출력하시오.
1. 국어 영어 수학 총점 자료형 int
2. 레벨 - 평균이 90점대면 레벨9,80점대면8,70점대면7,60점대면6
  국어점수 입력 >100
  영어점수 입력 >100
  수학점수 입력 >99
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
:: GOOD  IT SCORE ::
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
국어   영어   수학   총점   평균   레벨
100   100   99   299   99.67   9
 */