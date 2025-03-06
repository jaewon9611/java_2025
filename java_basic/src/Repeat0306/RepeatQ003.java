package Repeat0306;

class Car4 extends Object{
	private String color; //private 수정금지

	public Car4() {super();}
	@Override public String toString() {
		return "Car4 [color=" + color+"]";
	}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}
public class RepeatQ003 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.setColor("red");
		System.out.println(c1);
	}
}
/*
Q7
private - package - protected - public 
Q10 
클래스 재사용
Q11 class 자식클래스 extends 부모클래스

*/