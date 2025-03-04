package com.company.java010_ex;
//1. 클래스는 부품객체
//2. 상태(멤버변수)와 행위(멤버함수)

class Score{
	String stdid; int kor,eng,math,total,avg;
	void total() {total=kor+eng+math;}
	
	void avg() {avg= total/3;}
	
	void info() {
		total(); // 메서드안에서 메스드 호출가능
		System.out.println("학번	kor	eng	math	total	avg \n"
				+ stdid +"\t" + kor+"\t" + + eng+"\t" +math+ "\t"+total+"\t"+String.format("%.2f", total/3.0) );
	}
	Score() {}
	Score(String stdid, int kor,  int eng, int math) {
		this.stdid=stdid;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}


public class ClassEx006 {
	public static void main(String[] args) {
		Score  s1= new Score("std1234" , 100, 100 , 99 ); 
		   s1.info();
		Score s2 = new Score();
	}
}
/*
-- 생성자 작성하시오.
class Score{
   //상태-멤버변수  :  String stdid; int kor,eng,math,total,avg;   
   //행위-멤버함수  :  void total() 총점구해주기
   //               void avg()  평균구하기
   //               void info()   학생정보출력   힌트2) info(){total(); avg();} 다른메서드에서 메서드 사용가능
   // 힌트1) 생성자: Score() / Score(stdud,kor,eng,math)
}
public class ClassEx005{
   public static void main(String[] args) {
   Score  s1= new Score("std1234" , 100, 100 , 99 ); 
   s1.info();
   }
}

출력내용 :
학번   kor   eng   math   total   avg
std1234   100   100   99   299   99.67
*/