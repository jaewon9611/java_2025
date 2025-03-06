package com.company.java013;

class Score{
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
}
class ScoreDto extends Score {
	private String jang;
	private String star;
	private String pass;
}
abstract class Process {
	abstract double exec(int kor, int eng, int math);
	abstract double exec(int total);
	abstract double exec(double avg);
}
abstract class Print {
	abstract void show(ScoreDto std);
	abstract void show(ScoreDto []std);
}
class StdPrint extends Print{
	@Override void show(ScoreDto std) {System.out.println(
			"============================================="
	+ "이름\t국어\t영어\t수학\t총점\t평균\t합격\t장학생\t랭킹");}
	@Override void show(ScoreDto[] std) {
		System.out.println();
	}	
}

public class Abstract003 {
	public static void main(String[] args) {
	//	ScoreDto std = new ScoreDto("헐크",100,100,99);
		Process process = null; // 총점,평균,장학생(95점이상), 평균점수대 만큼의 별처리
		                          //합격여부(60점이상합격,아니면불합격)처리 해준다.
		Print print = null;
	//	print = new StdPrint(); print.show(std);
	}
}
