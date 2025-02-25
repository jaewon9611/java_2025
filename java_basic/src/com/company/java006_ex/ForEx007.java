package com.company.java006_ex;

import java.util.Scanner;

public class ForEx007 {
	public static void main(String[] args) {
		//변수
		int num; int a=-1;  int b=-2; char op =' '; double result = ' ';
		Scanner sc = new Scanner(System.in);
		// 입력
		/* break (빠져나와!) / continue (밑에꺼 skip)
		  for(;;){ // 1-1. 무한반복
		  #todo1 if(잘못썻으면) { 숫자1입력받기 } ->if(!(0<=a && a<=100)) { 숫자1입력받기 }
		  #todo2 if(잘못썻으면) { 숫자2입력받기 }
		  #todo3 if(잘못썻으면) { 연산자입력받고 }
		  1-2. 빠져나올조건-빠져나오기 break
		 */
		for(;;) {
			if(!(0<=a && a<=100)) {
				System.out.println("숫자1입력>"); a = sc.nextInt(); continue;
			// continue; 잘못입력받았으면 아래꺼진행하면 안됨.
			}
			if(0<b || b>100) {
				System.out.println("숫자2입력>"); b = sc.nextInt(); continue;
			}
			if(!(op=='+' || op=='-' || op=='*' || op=='/')) {
				System.out.println("연산자 입력>"); op = sc.next().charAt(0); continue;
		}
			break;	
		}
	}
}