package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006_menu {
	public static void main(String[] args) {
		//1. 변수
		int num=-1;
		Scanner sc = new Scanner(System.in);
		
		//기능1) 2. 입력 3. 처리 4. 출력
		for(;;) { //###### 1-1 무한반복
			System.out.println("메뉴판입니다. > 9번 누르면 종료");
			num = sc.nextInt();
			if(num==9) {break;} // 1-2 빠져나오는 조건
		}
	}
}
//////////메뉴판 만들기 
// RepeatEx006 - 무한 반복을 하는데 9를 입력받으면 종료