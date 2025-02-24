package com.company.java006_ex;

public class RepeatEx008 {
	public static void main(String[] args) {
		//변수
		int sum=0;
		//입력 + 처리 + 출력
		// 1~10까지 3의 배수의 합 : 18
		// 1이 3의 배수라면 sum에 누적
		// 2가 3의 배수라면 sum에 누적
		// if(3이 3의 배수라면) {sum에 누적}
		//if(1%3==0) {sum+=i}
		//if(2%3==0) {sum+=i}
		//if(3%3==0) {sum+=i}
		//if(4%3==0) {sum+=i}
		//if(5%3==0) {sum+=i}
		//if(6%3==0) {sum+=i}
		for(int i=1; i<=10; i++) {if(i%3==0) {sum+=i;}}  System.out.print(sum + "\n");
		sum=0;
		int i=1;	while(i<=10) {if(i%3==0) {sum+=i;}i++;}  System.out.print(sum + "\n");
		sum=0;
		i=1;	 do{if(i%3==0) {sum+=i;}i++;}while(i<=10);  System.out.print(sum);
	}
}
