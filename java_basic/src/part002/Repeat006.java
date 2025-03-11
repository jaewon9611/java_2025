package part002;
/*
1. 상속? 재사용
2. class 자식 extends 부모
3. 
    Object              $4 Object() {   #5} 객체생성
     ↑
     A1 {a}             #2 A1() {  a=0; #6}
     ↑
     B1 {b}             #2 B1() {  b=0; #7}
     ↑
     C1 {c}             #1 C1() {  c=0; #8}
     
     객체호출순서 : C1() B1() A1() Object()
     객체생성순서 : Object A1   B1       C1
*/
class A1 extends Object { int a; public A1() { super(); } }
class B1 extends A1     { int b; public B1() { super(); } }
class C1 extends B1     { int c; public C1() { super(); }  
   public void showC() {
      System.out.println("상속받은 A클래스의 a : " + a);
      System.out.println("상속받은 B클래스의 b : " + b);
      System.out.println("자신멤버의 C클래스의 c: " + c);
   }
}
public class Repeat006 {
	public static void main(String[] args) {
		C1  myc = new C1();   
		   myc.a = 10; myc.b=20; myc.c=30;
		   myc.showC();
	}
}
/*
Q1) 클래스를 상속하는 이유를 적으시오.
Q2) 상속의 형식을 적으시오.
Q3) ##을 채우고 출력되는 결과를 적으시오.
class A1 [##1] {// Object를 상속받는다
int a;
public A1() {super();}
public A1(int a) {super(); this.a=a;}
}
class B1 [##2] A1 { // A1을 상속받는다
int b;
public B1(){super();}
public B1(int b){this.b=b;}
public B1(int a , int b){super(a); this.b=b;}
}
*/