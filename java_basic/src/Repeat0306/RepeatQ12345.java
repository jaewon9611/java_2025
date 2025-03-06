package Repeat0306;

class A11{
	int a; //(1)
	A11(){}
	A11(int a) { this.a= a;} //(2)
	//(3) void show()
	void show() {this.a=11; System.out.println(this.a);}
	//(4) static void classMethod()
	static void classMethod() {/*this.a=12*/}
	//(5) int show2()
	// static이 jvm 로딩시 제일먼저 메모리상에 올라감. this는 new를 이용해 사용해야함. 순서안맞음.
	// static은 instance 사용불가
	int show2() {int a=1; return a;}
	//인스턴스메서드 - heap area - new O - this 각각
	//int show2() {int a; return;} show2 메서드 안에 있는 int a는 지역변수
	// int a는 stack - 임시공간 - 변수초기화안됨.주의
public class RepeatQ123 {
	public static void main(String[] args) {
		A11 a1= new A11();} //(6)  a1 지역변수 stack 영역
	}
}
/*
Q1
(1)int a 인스턴스변수
(2)A11(int a) 지역변수
(3)void show() 클래스변수
(4)static void classMethod() 클래스메서드
(5)int show() 인스턴스메서드

Q2
static void classMethod() {this.a=12;}
                    ↓
static void classMethod() {//this.a=12;}

int show2() {int a; return a;}
                    ↓
int show2() {int a=1; return a;}

Q3
new
A11()
a1

Q4
오버로딩,상속

Q5
c,d
*/