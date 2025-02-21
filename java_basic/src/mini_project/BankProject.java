package mini_project;

import java.util.Scanner;

public class BankProject {
	public static void main(String[] args) {
		//변수
		int num = 1;
		int cnt = 0;
		Scanner sc = new  Scanner(System.in);
		// 무한반복
		for(;;) { // 1-1무한 반복
			System.out.println("======BANK=====\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료");
			num = sc.nextInt();
			// 2을 2번 입력하면 다른 문구로 출력 ,3번입력시 다른문구 출력
			// 3을 2번 입력하면 다른 문구로 출력 
			// 4을 2번 입력하면 다른 문구로 출력 
			// 5을 2번 입력하면 다른 문구로 출력, 3번입력시 계좌 삭제여부 확인후 n누르면 반복
			// 4번 입력시 계좌 삭제여부 y누르면 break;
			if(num==9) {System.out.println("종료기능입니다.");break;}	// 1-2 멈춤
				 if(num==1) {System.out.println("아이디입력 : a\r\n"
					+ "비밀번호 입력 : a\r\n"
					+ "나이 입력 : 1\r\n"
					+ "잔액 입력 : 1");}
			else if(num==2) {System.out.println("아이디입력 : a\r\n"
					+ "비밀번호 입력 : b\r\n"
					+ "다시 확인해주세요");}
			else if(num==3) {System.out.println("아이디입력 : a\r\n"
					+ "비밀번호 입력 : a\r\n"
					+ "입금 : 100\r\n"
					+ "==입금완료\r\n"
					+ "잔액 : 101");}
			else if(num==4) {System.out.println("아이디입력 : a\r\n"
					+ "비밀번호 입력 : a\r\n"
					+ "다시 확인해주세요");}
			else if(num==5) {System.out.println("아이디입력 : a\r\n"
					+ "비밀번호 입력 : b\r\n"
					+ "다시 확인해주세요");}
		}
	}
}	

//만약 2를 2번 입력하면 다른 문구 출력
//if(만약 2를 2번 출력하면){다른 문구 출력}
//if(num2==)