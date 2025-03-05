package com.company.java012;
//자식은 부모보다 더 넓게 잡아야함 
class MobileNote7 extends Object {
	private String iris;
	public String getIris() {return iris;}
	public void setIris(String iris) {this.iris = iris;}
	void newShow() {System.out.println(
			"::::NOTE7새로운기능\n="+"iris 홍채인식기능!\n"
	+"="+"myiris : "+ this.iris);}
}

class MobileNote8 extends MobileNote7 {
	private String face;
	public String getFace() {return face;}
	public void setFace(String face) {this.face = face;}
	@Override protected void newShow() {
		super.newShow();
		System.out.println(
			"::::NOTE8새로운기능\n="+"face 안면인식기능!\n"
					+"="+"myface : "+ this.face);	}
}

class MobileNote9 extends MobileNote8 {
	private int battery=24;
	public int getBattery() {return battery;}
	public void setBattery(int battery) {this.battery = battery;}
	@Override public void newShow() {
		super.newShow();
		System.out.println(
			"::::NOTE9새로운기능\n="+"battery 하루종일사용가능!\n"
					+"="+"battery : "+ this.battery);}
}
public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newShow();
	}
}
