package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String[] args) {
		String cslNum = " "; String lev = " "; String pass = " "; String stu = " ";
		int kor = 0; int math = 0; int eng = 0; int total; double avg;
		Scanner sc = new Scanner(System.in);
		//
		System.out.print("1. 학번 입력 → "); cslNum = sc.next();
		System.out.print("2. 국어 점수 입력 → "); kor = sc.nextInt();
		System.out.print("3. 수학 점수 입력 → "); math = sc.nextInt();
		System.out.print("4. 영어 점수 입력 → "); eng = sc.nextInt();
		//
		total = kor + math + eng;
		avg = total/3;    // avg=total/3.0f; 도 가능
		
		//
		if(avg>=60 && kor>=40 && math>=40 && eng>=40) {pass=("합격");}
		else  {pass=("불합격");}
		//System.out.println((avg>=60 && kor>40 && math>40 && eng>40)? pass="합격" : "과락"); pass = sc.next();
		if (avg>=95) {stu="장학생";}
		else {stu=("X");}
		//System.out.println(avg>95 ? stu="장학생" : "X");
		
		/*lev = (avg>=90)? "수" :
							(avg>=80)? "우";
								(avg>=70)? "미" :
									(avg>=60)? "양" :
										(avg>=60)?"양":"가";
		*/
			 if (avg>=90) {lev="수";}
		else if (avg>=80) {lev="우";}
		else if (avg>=70) {lev="미";}
		else if (avg>=60) {lev="양";}
		else 			  {lev="가";}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+" 학번   국어  	영어  	수학  	총점  	평균  	합격여부 	레벨  	장학생\n"
				+":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(cslNum + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" +String.format("%.2f", avg) 
							+ "\t" +pass + "\t" + lev + "\t" + stu);
	}
}// if (avg<=60 && kor<40 && math<40 && eng<40)
/*연습문제8)  ※ 숙제
패키지명 : com.company.java004_ex
클래스명 :  IfEx008
출력내용 :  성적처리 프로그램입니다.

1. 총점 구하기
2. 평균 구하기
3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
4. 평균이 95점이상이면 장학생
5. 평균이  90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 

학번 입력 > std111
국어점수 입력 > 100
수학점수 입력 > 100
영어점수 입력 > 99
=================================================================================== 
학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생
=================================================================================== 
std111   100   100   99   299   99.67   합격   수   장학생
*/
