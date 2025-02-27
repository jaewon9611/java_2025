package com.company.java009_ex;
	//멤버변수 :
class Student001{
	//멤버함수:
	String name; int kor, eng, math, total;
	double avg;
	
	void info() {System.out.println(
			"이름: " +this.name + "\n" + "총점: " +this.total
			+"\n"
			+"평균: " + String.format("%.2f",this.avg)); }
}

public class ClassEx001 {
	public static void main(String[] args) {
		Student001   s1 = new Student001(); //1. new(공간, 객체생성) 2.Student001() 초기화 3. s1 지번
	     s1.name="first"; s1.kor=100; s1.eng=100; s1.math=99; 
	     s1.total=s1.kor+s1.eng+s1.math;
	     s1.avg=s1.total/3.0;
	     s1.info();
	}
}
/* 클래스 설계도 -인스턴스화 ( heap - new - 객체생성)를 통해 - 객체(객체들s1, s2 ,s3 뭉쳐서 표현) / 인스턴스(각각의 s1.name,s2.name)
----------------------------------------- [runtime data area]
[method:정보, static, final:공용정보]	student001.class   /   ClassEx001.class
-----------------------------------------
[heap:동적]							|[stack:잠깐빌리기]
15번째줄 : 1번지 {name=first, kor=100,eng=100,math=99} ← s1:1번지
14번째줄 : 1번지 {name=null, kor=0,eng=0,math=0} ← s1:1번지
									| main
-----------------------------------------

class Student001{
  멤버변수 : String name;  int no, kor, eng, math;
  멤버함수 : void info()
}
public class ClassEx001{
   public static void main(String[] args) {
      Student001   s1 = new Student001();
     s1.name="first"; s1.kor=100; s1.eng=100; s1.math=99;
     s1.info();
   }
}
출력내용 : 
  이름: first
  총점 : 299
  평균 : 99.67
*/