package com.company.java011_ex;
//1 클래스는 부품객체
//2 상태(멤버변수)와 행위(멤버함수)
public class Score {
	public Score() { this.name = this.p = this.s=this.rank = "";}
	public Score(String name, int kor, int eng, int math) {
		this();
		this.name=name; this.kor=kor; this.eng=eng; this.math=math;
	} //1. new 메모리,객체생성 2.Score() 초기화 3.a1번지
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public int getTotal() {return total;}
	public void setTotal(int total) {this.total = total;}
	public double getAver() {return aver;}
	public void setAver(double aver) {this.aver = aver;}
	public String getP() {return p;}
	public void setP(String p) {this.p = p;}
	public String getS() {return s;}
	public void setS(String s) {this.s = s;}
	public String getRank() {return rank;}
	public void setRank(String rank) {this.rank = rank;}
	private String name;
	private int kor, eng, math , total;
	private double aver;
	private String p  , s  , rank;
	 
	@Override public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";
	}
	public static void info() {System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
		+"\n이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹"
		+"\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	public void show() {total=kor+eng+math; aver=total/3;
	if(aver>=40) {p="합격";}
	else {p="불합격";}
	s = aver>=95? "장학생":"X";
	for(int i=0; i<(int)aver/10; i++) {rank+="*";}
		System.out.println(name + "\t" + kor + "\t" + eng+ "\t" + math+ "\t" + total + "\t"+String.format("%.2f", aver=total/3) + "\t"+ p +"\t" + s + "\t" + rank);
	}

}
